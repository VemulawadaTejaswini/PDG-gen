import java.io.*;
import java.util.*;

public class Main{


    static int color[];
    
    public static void main(String args[]) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	String str[]=br.readLine().split(" ");
	int n=Integer.parseInt(str[0]);
	int m=Integer.parseInt(str[1]);

        ArrayList<ArrayList<Integer>> edge=new ArrayList<>();
	color=new int[n];
	Arrays.fill(color,-1);

	for(int i=0;i<n;i++){
	    edge.add(new ArrayList<>());
	}

	for(int i=0;i<m;i++){
	    str=br.readLine().split(" ");
	    int a=Integer.parseInt(str[0]);
	    int b=Integer.parseInt(str[1]);

	    edge.get(a).add(b);
	    edge.get(b).add(a);
	}

	int c=1;
	for(int i=0;i<n;i++){
	    if(color[i]==-1)
		dfs(edge,n,i,c++);
	}
	
	int q=Integer.parseInt(br.readLine());
	for(int i=0;i<q;i++){
	    str=br.readLine().split(" ");
	    int s=Integer.parseInt(str[0]);
	    int g=Integer.parseInt(str[1]);

	    
	    if(color[s]==color[g]){
		System.out.println("yes");
	    }else{
		System.out.println("no");
	    }
	}
    }
    static void dfs(ArrayList<ArrayList<Integer>> edge,int n,int s,int c){
	Deque<Integer> stack=new ArrayDeque<>();

	color[s]=c;
	stack.add(s);
	while(!stack.isEmpty()){
	    int now=stack.poll();

	    for(int i:edge.get(now)){
		if(color[i]==-1){
		    color[i]=c;
		    stack.add(i);
		}
	    }
	}
    }
}

