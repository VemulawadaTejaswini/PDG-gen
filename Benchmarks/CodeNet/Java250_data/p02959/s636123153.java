import java.io.*; 
import java.util.*; 

public class Main{ 
	
	static class FastReader{ 
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
				catch (IOException e) 
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
  
	public static void main(String[] args) 
	{ 
		FastReader sc = new FastReader(); 
		int n = sc.nextInt();
      	long[] arr = new long[n+1], brr = new long[n];
      	long res = 0;
      	for(int i=0;i<=n;i++){
           	arr[i] = sc.nextLong();
          	res+=arr[i];
        }
      	
      	for(int j=0;j<n;j++)
          	brr[j] = sc.nextLong();
		
      	for(int i=n-1;i>=0;i--){
          	long temp = Math.min(brr[i], arr[i+1]);
          	brr[i]-=temp;
          	arr[i+1]-=temp;
          	arr[i] -= Math.min(arr[i], brr[i]);
          	
          	res-=arr[i+1];
        }
      	res-=arr[0];
      	System.out.println(res); 
	}
}
