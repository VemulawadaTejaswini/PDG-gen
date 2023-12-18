import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws Exception{
	    FastReader s = new FastReader();
	    int rows = s.nextInt();
	    int cols = s.nextInt();
	    int m = s.nextInt();
	    Map<Integer, Set<Integer>> rowmap = new HashMap<>();
	    Map<Integer, Set<Integer>> colmap = new HashMap<>();
	    for(int i = 1; i <= rows; i++){
	        rowmap.put(i, new HashSet<Integer>());
	    }
	    for(int i = 1; i <= cols; i++){
	        colmap.put(i, new HashSet<Integer>());
	    }
	    for(int i = 0; i < m; i++){
	        int r = s.nextInt();
	        int c = s.nextInt();
	        rowmap.get(r).add(c);
	        colmap.get(c).add(r);
	    }
	    int ans = 0;
	    for(int i = 1; i <= rows; i++){
	        for(int j = 1; j <= cols; j++){
	            int sum = 0;
	            sum += rowmap.get(i).size();
	            sum += colmap.get(j).size();
	            if(rowmap.get(i).contains(j)){
	                sum--;
	            }
	            ans = Math.max(ans, sum);
	        }
	    }
	    System.out.println(ans);
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
