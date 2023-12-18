import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main 
{ 

	 static FastReader sc=new FastReader(); 
	  public static void main(String[] args) 
    {
    	
        	int n=i();
//        	int A[]=new int[n];
//        	input(A);
StringBuffer s=new StringBuffer("7");
  BigInteger b1, b2,b3; 
  
        b1 = new BigInteger("3515219485"); 
        b2 = new BigInteger(Integer.toString(n));
        b3=BigInteger.valueOf(0);
        int c=1;
        if(n%2==0){
            System.out.println("-1");
            return;
        }
        for(int i=1;i>0;i++){
           b1 = new BigInteger(s.toString());
           if(b1.remainder(b2).equals(b3)){
               System.out.println(c);
               break;
           }
           else{
               s.append('7');
               c++;
           }
        }
        
        	
        	//System.out.println();
        	
		
        	
        	
			
	
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
        static void shuffleArray(int[] arr){
        int n = arr.length;
        Random rnd = new Random();
        for(int i=0; i<n; ++i){
            int tmp = arr[i];
            int randomPos = i + rnd.nextInt(n-i);
            arr[i] = arr[randomPos];
            arr[randomPos] = tmp;
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



