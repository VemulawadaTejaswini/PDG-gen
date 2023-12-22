import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String l = in.readLine();
        String m = in.readLine();
        String n = in.readLine();
        String o = in.readLine();
        
    int N = Integer.parseInt(l);//5
    int K = Integer.parseInt(m);//3
    int X = Integer.parseInt(n);//10000
    int Y = Integer.parseInt(o);//9000

    
          	   	 if(N>K) {
        	   	   	 System.out.println(N*X-(X-Y)*(N-K));   
  				 } else if (N<=K)
       				 System.out.println(N*X); 
   }
   }