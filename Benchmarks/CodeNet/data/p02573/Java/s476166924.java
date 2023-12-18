import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

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
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int e = sc.nextInt();
	
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
		for(int i = 0 ; i <n+1; i++)
		{
			
			adj.add(new ArrayList<Integer>());
			
		}
		
		
			for(int k = 0 ; k < e; k++)
			{
				int a = sc.nextInt();
				int b = sc.nextInt();
				
				if(a > b)
				{
				if(!adj.get(a).contains(b) || !adj.get(b).contains(a))
				{
				addEdges(adj,b,a);
				}
				}
				else
				{
					if(!adj.get(a).contains(b) || !adj.get(b).contains(a))
					{
					addEdges(adj,a,b);
					}	
				}
				
			}
			int count = 0;
			for(int j = 0 ; j<adj.size(); j++)
			{
				if(adj.get(j).size()>1)
				{
					
					count+=1;
				}
				else
				{
				//System.out.println(j+" "+adj.get(j).size());
				count+=adj.get(j).size();
				}
			}
			if(count > n)
			{
				System.out.println(n);
			}
			else
			{
				System.out.println(count);
			}
		

	}
	static void addEdges(ArrayList<ArrayList<Integer>> adj,int u,int v)
	{
		adj.get(u).add(v);
	}
}
