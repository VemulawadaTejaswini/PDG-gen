import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

class vertex{
	private final int EMPTY = -1;

	int id,cost = EMPTY;
	boolean fix = false;
	int[] e;
}

public class Main {

    private static ArrayList<vertex>  ar = new ArrayList<vertex>();
    private static boolean[] fix_ar;
    private static       int N,
                             cost_sum =    0;

    private static final int START    =    1,
                             S        =    0,
                             EMPTY    =   -1,
                             MAX      = 2001;

    public static void main(String[] args) {

        //input
         Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"));
         int      N = sc.nextInt();

         fix_ar = new boolean[N];

         vertex a;String[] s;
         for(int i = 0;i < N;i++){
             s = sc.next().split("\\s");
             a = new vertex();
             a.id = i;
        	 a.e = new int[N];
        	 for(int j=0;j<N;j++){a.e[j] = Integer.parseInt(s[j]);}
        	 ar.add(a);
         }

         //calculation
       	 PRIM();

         //output
         for (adj_list d:ar) {System.out.println(d.u + " " + d.d);}
    }

    private static void PRIM(){

    	vertex v = ar.get(S);
    	int min = MAX,v_id;
    	fix_ar[S] = true;
    	for(int i=0;i<N;i++){
    		if(v.e[i] != EMPTY){
//    			v.cost = v.e[i];
    			if(v.e[i]<min){
    				min = v.e[i];
    				v_id = i;
    			}
   			}
    	}
    	fix_ar[v_id] = true;
    	cost_sum += min;

    	ArrayDeque<adj_list> q = new ArrayDeque<adj_list>();
    	adj_list s = get_list(START);
    	s.d = S;
    	s.find_flg = true;
    	q.add(s);

    	while(!q.isEmpty()){
    		adj_list u = q.poll();

    		for(int v:u.v){
    			adj_list a = get_list(v);
    			if(a.find_flg){continue;}
    			a.d = u.d+1;
    			a.find_flg = true;
    			q.add(a);
    		}
    	}
    }

    private static adj_list get_list(int id){
        adj_list ret = null;
        for(adj_list a:ar){if(a.u == id){ret = a;}}
        return ret;
    }
}