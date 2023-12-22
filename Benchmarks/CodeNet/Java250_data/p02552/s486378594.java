import java.io.*;
import java.util.*;
import java.lang.Math;

public class Main{
	static BufferedReader reader;
	static StringTokenizer tokenizer;
	static PrintWriter writer;

	static int nextInt() throws IOException {
		return Integer.parseInt(nextToken());
	}

	static long nextLong() throws IOException {
		return Long.parseLong(nextToken());
	}

	static double nextDouble() throws IOException {
		return Double.parseDouble(nextToken());
	}

	static String nextToken() throws IOException {
		while (tokenizer == null || !tokenizer.hasMoreTokens()) {
			tokenizer = new StringTokenizer(reader.readLine());
		}
		return tokenizer.nextToken();
	}
	static String nexts() throws IOException {
	  	  tokenizer = new StringTokenizer(reader.readLine());
	   	 String s="";
	   	 while (tokenizer.hasMoreTokens()) {
			s+=tokenizer.nextElement()+" ";
		}
		return s;
	}

	//String str=nextToken();
	//String[] s = str.split("\\s+");

	public static int gcd(int x, int y){
		if (y == 0) return x; else return gcd(y, x % y);
	}

	public static boolean isPrime(int n) 
	    { 
	        // Corner cases 
	        if (n <= 1){
		 return false; }
	        if (n <= 3){
		 return true; }
	      
	        // This is checked so that we can skip  
	        // middle five numbers in below loop 
	        if (n % 2 == 0 || n % 3 == 0){
		 return false; }
	      
	        for (int i = 5; i * i <= n; i = i + 6) {    //Checking 6i+1 & 6i-1
	            if (n % i == 0 || n % (i + 2) == 0) {
	            	return false;  }
	            }
			//O(sqrt(n))
	        return true; 
	    } 

	public static void shuffle(int[] A) {
		for (int i = 0; i < A.length; i++) {
			int j = (int)(i * Math.random());
			int tmp = A[i];
			A[i] = A[j];
			A[j] = tmp;
		}
	}

	 public static long power(int x, long n)
	{
	    long mod = 1000000007;
		if (n == 0) {
			return 1;
		}

		long pow = power(x, n / 2);

		if ((n & 1) == 1) {
			return (x * pow * pow)%mod;
		}
		return (pow * pow)%mod;
	}
	 static long ncr(int n, int k)  
   	 { 
      
     		  long res = 1; 
  		   // Since C(n, k) = C(n, n-k)  
 		       if (k > n - k) { 
     		       k = n - k; 
      		  } 
  		  // Calculate value of [n*(n-1)*---*(n-k+1)] / [k*(k-1)*---*1]  
     		   for (int i = 0; i < k; ++i) { 
        		    res *= (n - i); 
         		   res /= (i + 1); 
     		   } 
  		  return res; 
    }
	static int first(int arr[], int low, int high, int x, int n)   //Returns first index of x in sorted arr else -1
  	  { 
    	  if(high >= low) 
     	 { 
      	  
        	  int mid =low + (high - low)/2;   
      	  if( ( mid == 0 || x > arr[mid-1]) && arr[mid] == x) 
      		    return mid; 
       	 else if(x > arr[mid]) 
       		   return first(arr, (mid + 1), high, x, n); 
        	else
      		    return first(arr, low, (mid -1), x, n); 
     	 } 
    		  return -1; 
  	  } 

	static int last(int arr[], int low, int high, int x, int n)     //Returns last index of x in sorted arr else -1
 	   { 
   	   if(high >= low) 
     	 { 
      	    
     	   int mid = low + (high - low)/2;  
       	 if( ( mid == n-1 || x < arr[mid+1]) && arr[mid] == x ) 
       		   return mid; 
      	  else if(x < arr[mid]) 
     		     return last(arr, low, (mid -1), x, n); 
     	   else
    		      return last(arr, (mid + 1), high, x, n);       
    	  } 
     		 return -1; 
	    } 
	static int binarys(int[] arr, int l, int r, int x){
    	    while(l<=r){
         	   int mid = l+(r-l)/2;
          	  if(arr[mid]==x){
          	      return x;
         	   }
          	  if(arr[mid]<x){
           	     l=mid+1;
           	 }
           	 else{
            	    r=mid-1;
           	 }
      	  }
	return -1;
    	}
	 static class R implements Comparable<R>{
	        int x, y;
	        public  R(int x, int y) {
	            this.x = x;
	            this.y = y;
	        }
	        public int compareTo(R o) {
            		return x-o.x;     //Increasing order(Which is usually required)
        		}
	    }   
	// int t=a[i];
	// a[i]=a[j];
	// a[j]=t;
	//double d=Math.sqrt(Math.pow(Math.abs(x2-x1),2)+Math.pow(Math.abs(y2-y1),2));
	public static void main(String[] args) throws IOException {
		reader = new BufferedReader(new InputStreamReader(System.in));
		tokenizer = null;
		writer = new PrintWriter(System.out);
		solve();
		reader.close();
		writer.close();
	}
	
	private static void solve() throws IOException {
		//int t = nextInt();
		//while(t-->0){
			//long n = nextLong();
			//String s= nextToken();
			//long[] a=new long[n];
			//ArrayList<Integer> ar=new ArrayList<Integer>();
			//HashSet<Integer> set=new HashSet<Integer>();
			//HashMap<Integer,String> h=new HashMap<Integer,String>();
			//R[] a1=new R[n];
			//char[] c=nextToken().toCharArray();

			int n = nextInt();
			if(n==1){
              writer.println("0");
            }
      else{
        writer.println("1");
      }
			
			//writer.println("YES");
		 }
	//}
}
