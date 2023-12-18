import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        
       
        int n = sc.nextInt();
        long[]arr = new long[n];
        boolean set = false;
        for(int i = 0; i < n; ++i) {
         arr[i] = sc.nextLong();  
         if(arr[i] == 0) {
          set = true;   
         }
        }
        if(!set) {
            BigInteger b = new BigInteger("1");
            BigInteger fin = new BigInteger("" + (long)Math.pow(10, 18));
            boolean f = false;

            for(long x : arr) {
             b = b.multiply(new BigInteger(String.valueOf(x)));
             if(x == 0){
              b = new BigInteger("0");
              break;
             }
             if(b.compareTo(fin) == 1)
             {
                 f = true;
                 break;
             }

            }

            if(f)
                out.write("-1");
            else
                System.out.print(b.toString());
        }
        else
            out.write("0");
      
        
        out.flush();
    }
}