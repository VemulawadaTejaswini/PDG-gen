import java.io.*;
import java.math.*;
import java.util.*;
import java.lang.*;

// import java.text.DecimalFormat; 
// import java.text.DecimalFormatSymbols; 
 
 
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
 
public class TestClass {
    
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
        
        int T =Integer.parseInt(br.readLine());
        int ans=0;
        if(T%1000!=0)
            ans = 1000- T%1000;
        str.append(ans);
        pw.print(str.toString());
        pw.close();
    }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    
}