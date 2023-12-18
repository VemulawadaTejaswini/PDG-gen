import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Set<Integer> list = new HashSet<Integer>();
        int N = sc.nextInt();
		int Q = sc.nextInt();
		int[] color = new int[N];
		int[] Qcount = new int[Q];
		for(int i=0;i<N;i++){
		    color[i] = sc.nextInt();
		}
		for(int i=0;i<Q;i++){
		    list=new HashSet<Integer>();
		    int l = sc.nextInt();
		    int r = sc.nextInt();
		    for(int k=l-1;k<r;k++){
		        list.add(color[k]);
		    }
		    Qcount[i]=list.size();
		    if(Qcount[i]==0){
		        Qcount[i]=1;
		    }
		}
		for(int i=0;i<Q;i++){
			System.out.println(Qcount[i]);
		}
	}
}
