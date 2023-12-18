

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main 
{
	static int INF = 999999999;
	static Left NIL = new Left(-1);
	static Left[] pairv;
	
	static boolean BFS()
	{
		LinkedList<Left> q = new LinkedList<>();
		for(Left u : l)
		{
			if(u.pair == -1)
			{
				u.dist = 0;
				q.add(u);
			}
			else u.dist = INF;
		}
		NIL.dist = INF;
		while(!q.isEmpty())
		{
			Left u = q.poll();
			if(u.dist < NIL.dist)
			{
				for(int v : u.adj)
				{
					if(pairv[v].dist == INF)
					{
						pairv[v].dist = u.dist+1;
						q.add(pairv[v]);
					}
				}
			}
		}
		return NIL.dist != INF;
	}
	
	static boolean DFS(Left u)
	{
		if(u != NIL)
		{
			for(int v : u.adj)
				if(pairv[v].dist == u.dist + 1)
					if(DFS(pairv[v]))
					{
						pairv[v] = u;
						u.pair = v;
						return true;
					}
			u.dist = INF;
			return false;
		}
		return true;
	}
	
	static class Left
	{
		HashSet<Integer> adj = new HashSet<>();
		int id;
		int pair = -1;
		int dist = -1;
		
		public Left(int i)
		{
			id=i;
		}
	}
	
	static class En
	{
		int a;
		int b;
		
		public En(int a0, int b0)
		{
			a0 = a;
			b0 = b;
		}
	}
	
	static class C implements Comparator<En>
	{

		@Override
		public int compare(En o1, En o2) 
		{
			return o1.a-o2.a;
		}
		
	}

	static Left[] l;
	
	public static void main(String[] args) 
	{
		int MAX = 10000000;
		int[] sieve = new int[MAX+1];
		sieve[0] = 1;
		sieve[1] = 1;
		for(long i = 2; i <= MAX; i++)
		if(sieve[(int)i] == 0)
		{
			sieve[(int)i] = (int)i;
			for(long j = i*i; j <= MAX; j+= i)
			{
				sieve[(int)j] = (int)i;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 100; i++)
		{
//			System.out.print(i + ":" + sieve[i]+ ". ");
		}
		
		long timea = 0;
		long timeb = 0;
		long timec = 0;
		long timed = 0;
		FastReader sc = new FastReader();
		
		int[] has = new int[MAX+1];
		int curhaser = 0;
		
		while(true)
		{
			long curtime = System.currentTimeMillis();
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n==0)break;
			int[] a = new int[n];
			int[] b = new int[m];
			l = new Left[n];
			
			
			for(int i = 0; i < n; i++)
			{
				l[i] = new Left(i);
			}
			
			for(int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			for(int i = 0; i < m; i++)
				b[i] = sc.nextInt();


			timea += (System.currentTimeMillis() - curtime);
			curtime = System.currentTimeMillis();
			
			
			C c = new C();
			PriorityQueue<En> pq = new PriorityQueue<En>(c);
			
			for(int i = 0; i < MAX+1; i++)
				has[i] = -1;
			
			timeb += (System.currentTimeMillis() - curtime);
			curtime = System.currentTimeMillis();
			
			for(int j = 0; j < m; j++)
			{
				curhaser++;
				int cur = b[j];
				int orcur = cur;
				
				while(cur > 1)
				{
					has[sieve[cur]] = curhaser;
//					System.out.println(orcur + " has  " + sieve[cur]);
					cur /= sieve[cur];
				}
				
				for(int i = 0; i < n; i++)
				{
					int curi = a[i];
					while(curi > 1)
					{
//						System.out.println(i + " " + j + " " + curi);
						if(has[sieve[curi]] == curhaser)
						{ //found common divisor with this left-card
							pq.add(new En(i, j));
							l[i].adj.add(j);
//							System.out.println("Pairing " + a[i] + " " + orcur + " through " + sieve[curi]);
							break;
						}
						curi /= sieve[curi];
					}
				}
			}
//			System.out.println("Stage 1");
			timec += (System.currentTimeMillis() - curtime);
			curtime = System.currentTimeMillis();
			
			boolean[] pa = new boolean[n];
			boolean[] pb = new boolean[m];
			pairv = new Left[m];
			for(int i = 0; i < m; i++)
				pairv[i] = NIL;
			
			int matching = 0;
			int it = 0;
//			System.out.println("Go");
			while(BFS())
			{
				it++;
//				System.out.println("it " + it);
				for(int i = 0; i < n; i++)
				{
					Left u = l[i];
					if(u.pair == -1)
						if(DFS(u))
							matching++;
				}
			}
//			System.out.println("Stage 2");
			sb.append(matching + "\n");
			timed += (System.currentTimeMillis() - curtime);
			curtime = System.currentTimeMillis();
		}
		System.out.print(sb);
//		System.out.println(timea + " " + timeb + " " + timec + " " + timed);
	}
	
	
	
	
	
	
	
	
	
	
	
    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 	

}

