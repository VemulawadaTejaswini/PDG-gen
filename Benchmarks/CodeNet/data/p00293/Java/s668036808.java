import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Queue<Integer> N=new ArrayDeque<>(),M=new ArrayDeque<>();
		int n=in.nextInt();
		for(int i=0;i<n;i++) N.add(in.nextInt()*100+in.nextInt());
		int m=in.nextInt();
		for(int i=0;i<m;i++) M.add(in.nextInt()*100+in.nextInt());
		
		Queue<Integer> res=merge(N,M);
		while(!res.isEmpty()) {
			int v=res.remove();
			int j=v/100,k=v-(j*100);
			if(res.isEmpty())System.out.printf("%d:%02d\n",j,k);
			else System.out.printf("%d:%02d ",j,k);
		}
	}
	
	static Queue<Integer> merge(Queue<Integer> n,Queue<Integer> m) {
		Queue<Integer> mg=new ArrayDeque<>();
		while(!n.isEmpty() && !m.isEmpty()) {
			int a=n.peek(),b=m.peek();
			if(a<b) mg.add(n.remove());
			else if(a>b)mg.add(m.remove());
			else {
				mg.add(n.remove()); m.remove();
			}
		}
		
		while(!n.isEmpty())mg.add(n.remove());
		while(!m.isEmpty())mg.add(m.remove());
		return mg;
	}

}

