import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        
       
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        
        System.out.println((long)(a * b));
        
      
        
        out.flush();
    }
}