import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math; 
import java.util.Arrays;
import java.util.Comparator;
 
 
 
public class Main 
{ 
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

   

    static int binarySearch(int a[],int k,int l,int h){
        
        while(l<=h){
         int mid = (l+h)/2;
         if(a[mid]==k) return mid;
         else if(a[mid]>k) h=mid-1;
         else if(a[mid]<k) l =mid+1;
    }
        
        return -1;
    }



    static String reverse(String input)  
    { 
        char[] a = input.toCharArray(); 
        int l, r = 0; 
        r = a.length - 1; 
  
        for (l = 0; l < r; l++, r--) 
        { 
            // Swap values of l and r  
            char temp = a[l]; 
            a[l] = a[r]; 
            a[r] = temp; 
        } 
        return String.valueOf(a); 
    } 

   
    
    static int gcd(int a, int b) 
    { 
        // Everything divides 0  
        if (a == 0) 
          return b; 
        if (b == 0) 
          return a; 
       if (a == b) 
            return a; 
       if (a > b) 
            return gcd(a-b, b); 
        return gcd(a, b-a); 
    } 

    static int lcm(int a, int b) 
    { 
        return (a*b)/gcd(a, b); 
    } 

    static int solve(int A, int B) 
   { 
    int count = 0; 
    for (int i = 0; i < 21; i++) { 
        if (((A >> i) & 1) != ((B >> i) & 1)) { 
            count++; 
        } 
    } 
  
   return count;
  } 

        static long nCr(int n, int r) 
        { 
            return fact(n) / (fact(r) * 
                        fact(n - r)); 
        } 
        
        
        static long fact(int n) 
        { 
            long res = 1; 
            for (int i = 2; i <= n; i++) 
                res = res * i; 
            return res; 
        } 
        
        public static long count(long k) {
            return k * (k - 1) / 2;
        }

        static boolean isPrime(int n) { 
            // if(n==1) return false; 
            if(n==2) return true;
            if (n%2==0) return false; 
            
            for(int i=3;i<=Math.sqrt(n);i+=2) { 
                if(n%i==0) 
                    return false; 
            } 
            return true; 
        }

        static int negMod(int n){
            int a = (n % 1000000007 + 1000000007) % 1000000007;
            return a;
        }
        static String value(int val) {
            String bin = ""; 
                    while (val > 0)  
                    { 
                        if (val % 2 == 1) 
                        { 
                            bin += '1'; 
                        } 
                        else
                            bin += '0'; 
                        val /= 2; 
                    } 
                    bin = reverse(bin); 
                    return bin;
                }

                public static int sum(long x) {
                    int sum = 0;
                    while (x > 0) {
                        sum += x % 10;
                        x /= 10;
                    }
                    return sum;
                }
             
        
        static int mod=1000003;
        public static void main(String[] args) throws Exception 
    {   
        
        OutputStream outputStream = System.out;
        PrintWriter w = new PrintWriter(outputStream);
        FastReader sc = new FastReader();
        // Scanner sc = new Scanner(new File("input.txt"));
        // PrintWriter out = new PrintWriter(new File("output.txt"));
        int i,j;
        
        String s = sc.next();
        int r = 0;
        int max = 0;
        for(i=0;i<3;i++){
            if(s.charAt(i) == 'R') r++;
            else {
                max = Math.max(r,max);
                 r=0;}
        }
        if(max==0) max = r;
        w.print(max);
        w.close();
     }

       
}



// System.out.println();

        
    
    

