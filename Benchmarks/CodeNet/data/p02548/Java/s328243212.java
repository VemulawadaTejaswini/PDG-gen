import java.util.*;
import java.lang.*;
import java.io.*;
 class Main
{
    
     static int MAX = 1000001; 
    static int factor[]; 
  
    static void generatePrimeFactors() 
    { 
        factor[1] = 1; 
  
        // their value. 
        for (int i = 2; i < MAX; i++) 
            factor[i] = i; 
  
        for (int i = 4; i < MAX; i += 2) 
            factor[i] = 2; 
   
        for (int i = 3; i * i < MAX; i++) { 
            if (factor[i] == i) { 
                for (int j = i * i; j < MAX; j += i) { 
                     
                    if (factor[j] == j) 
                        factor[j] = i; 
                } 
            } 
        } 
    } 
  
    static int calculateNoOFactors(int n) 
    { 
        if (n == 1) 
            return 1; 
  
        int ans = 1; 
  
        int dup = factor[n]; 
  
        int c = 1; 
  
        int j = n / factor[n]; 
  
        while (j != 1) { 
            if (factor[j] == dup) 
                c += 1; 
  
            else { 
                dup = factor[j]; 
                ans = ans * (c + 1); 
                c = 1; 
            } 
  
            // prime factorizes a number 
            j = j / factor[j]; 
        } 
  
        // for the last prime factor 
        ans = ans * (c + 1); 
  
        return ans; 
    } 
    
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    
	    factor = new int[MAX]; 
        factor[0] = 0;
         generatePrimeFactors(); 
  
	   // BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int t=1;
	   // t=sc.nextInt();
	    //int t=Integer.parseInt(br.readLine());
	    while(--t>=0){
	        int n=sc.nextInt();
	        long ans=0;
	        for(int i=1;i<n;i++){
                  long temp=(long)calculateNoOFactors(n-i);
                  ans=ans+temp;
             }
	     System.out.println(ans);
	        
	    }
	    
	}
}