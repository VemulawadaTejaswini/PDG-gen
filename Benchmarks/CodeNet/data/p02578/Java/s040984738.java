import java.util.*;
import java.io.*;

public class Main 
{ 

	 static FastReader sc=new FastReader(); 
	  public static void main(String[] args) 
    {
    int n=i();
    int A[]=new int[n];
    input(A);
    long s=0;
    for(int i=0;i<n-1;i++){
        if(A[i+1]<A[i]){
            s+=A[i]-A[i+1];
            A[i+1]=A[i];
        }
    }
    System.out.println(s);
        	
			
	
	}    	
    	
   static void input(int A[]) {
	   for(int i=0;i<A.length;i++) {
		   A[i]=sc.nextInt();
	   }
   }
     static int i() {
    	 return sc.nextInt();
     }
     static String s() {
    	 return sc.next();
     }
     static long l() {
    	 return sc.nextLong();
     }
     public static String rev(String str){  
    	    char ch[]=str.toCharArray();  
    	    String rev="";  
    	    for(int i=ch.length-1;i>=0;i--){  
    	        rev+=ch[i];  
    	    }  
    	    return rev;  
    	}  
        static void sort(int[] arr){
        int n = arr.length;
        Random rnd = new Random();
        for(int i=0; i<n; ++i){
            int tmp = arr[i];
            int randomPos = i + rnd.nextInt(n-i);
            arr[i] = arr[randomPos];
            arr[randomPos] = tmp;
        }   
        Arrays.sort(arr);
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




