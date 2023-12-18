import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int M=stdIn.nextInt();
		ArrayList<ArrayList<Integer>> A=new ArrayList<ArrayList<Integer>>();
		Deque <Integer> Q=new ArrayDeque<Integer>();
		int ans[]=new int[N];
		boolean visit[]=new boolean[N];
		for(int i=0;i<N;i++){
			A.add(new ArrayList<Integer>());
		}
		for(int i=0;i<M;i++){
			int a=stdIn.nextInt()-1;
			int b=stdIn.nextInt()-1;
			ArrayList<Integer> c=new ArrayList<Integer>();
			c=A.get(a);c.add(b);A.set(a,c);
			c=A.get(b);c.add(a);A.set(b,c);
		}
		Q.add(0);visit[0]=true;
		while(Q.size()>0){
			int a=Q.poll();
			for(int i=0;i<A.get(a).size();i++){
				int b=A.get(a).get(i);
				if(visit[b]==false){
					ans[b]=a;visit[b]=true;Q.add(b);
				}
			}
		}
		System.out.println("Yes");
		for(int i=1;i<N;i++){
			System.out.println(ans[i]+1);
		}
	}
}
