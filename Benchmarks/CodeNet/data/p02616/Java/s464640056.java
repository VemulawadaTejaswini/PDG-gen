import java.io.*;
import java.math.*;
import java.util.*;
import java.lang.*;

// import java.text.DecimalFormat; 
// import java.text.DecimalFormatSymbols; 
 
 
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
 
public class Main {
    
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input
 
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
 
        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        
        for Round off
         DecimalFormat deciFormat = new DecimalFormat(); 
        deciFormat.setMaximumFractionDigits(9); 
        */
 
        // Write your code here
        StringBuffer str = new StringBuffer();
        PrintWriter pw=new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n =Integer.parseInt(s[0]);
        int k =Integer.parseInt(s[1]);
        s = br.readLine().split(" ");
        long[] a = new long[n];
        for(int i=0;i<n;i++)
            a[i] = Long.parseLong(s[i]);
            
        int M = 1000000007;
        long ans = mP(a,n,k,M);
        if(ans<0){
            ans = ans+M;
        }
        str.append(ans);

        pw.print(str.toString());
        pw.close();
    }
    static long mP(long A[], int n, int k,int M) 
    { 
        Arrays.sort(A); 
  
        long product = 1L; 
 
        if (A[n - 1] == 0 && k % 2 != 0) 
            return 0L; 
  
        if (A[n - 1] <= 0 && k % 2 != 0) { 
            for (int i = n - 1; i >= n - k; i--) {
                product = product*A[i]; 
                if(product>=M)
                    product-=M;
            }
                
            return product; 
        } 

        int i = 0; 
  
        int j = n - 1; 

        if (k % 2 != 0) { 
            product *= A[j]; 
            product %=M;
            j--; 
            k--; 
        } 
         
        k >>= 1; 
  

        for (int itr = 0; itr < k; itr++) { 

            long left_product = A[i] * A[i + 1]; 
            

            long right_product = A[j] * A[j - 1]; 
  
            if (left_product > right_product) { 
                product *= (left_product)%M; 
                i += 2; 
            } 
            else { 
                product *= (right_product)%M; 
                j -= 2; 
            } 
            product %=M;
        } 

        return product; 
    } 
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    
}