import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) 
	{
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int p = sc.nextInt();
		
		StringBuilder[] sb = new StringBuilder[n];
		int size[] = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			sb[i] = new StringBuilder();
		}
		
		for(int i = 0; i < p; i++)
		{
			int com = sc.nextInt();
			if(com == 0)
			{
				int id = sc.nextInt();
				int item = sc.nextInt();
				
				if(size[id] > 0)sb[id].append(" ");
				sb[id].append(item);
				size[id]++;
			}
			else if(com == 1)
			{
				int id = sc.nextInt();
				System.out.println(sb[id]);
			}
			else if(com == 2)
			{
				int id = sc.nextInt();
				size[id] = 0;
				sb[id] = new StringBuilder();
			}
		}
		
		
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

