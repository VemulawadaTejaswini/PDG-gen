import java.util.*;
public class Main {
	static class Disjoint
	{
		long[] rank,parent;
		int n;
		public Disjoint(int n)
		{
			this.n = n;
			rank = new long[n];
			parent = new long[n];
			makeSet();
		}
		private void makeSet()
		{
			for(int i = 0;i<n;i++)
			{
//				rank[i] = i;
				parent[i] = i;
			}
			
		}
		
		long find(long i)
		{
			i = (int)i;
			if(parent[(int) i] != i)
				parent[(int) i] = find(parent[(int) i]);
			
			return parent[(int) i];
		}
		void union(int x,int y)
		{
			long xRoot = find(x);
			long yRoot = find(y);
			
			if(xRoot == yRoot)
				return;
			
			if(rank[(int)xRoot] <= rank[(int)yRoot])
			{
				parent[(int)xRoot] = yRoot;
				rank[(int)yRoot]+=rank[(int)xRoot];
			}
			else 
			{
				parent[(int)yRoot] = xRoot;
				rank[(int)xRoot]+=rank[(int)yRoot];
			}
			
			 
	        
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		Disjoint dis = new Disjoint(n);
		
		while(m-- > 0)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			a--;
			b--;
			
			dis.union(a, b);
		}
		long max = 0;
		for(long i : dis.rank)
		{
			max = Math.max(max, i);
		}
		System.out.println(max + 1);
		
	}

}
