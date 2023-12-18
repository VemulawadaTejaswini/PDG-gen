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
        
        int T =Integer.parseInt(br.readLine());
        Map<String,Integer> mp = new HashMap<String,Integer>();
        mp.put("AC",0);
        mp.put("WA",0);
        mp.put("TLE",0);
        mp.put("RE",0);
        while(T-->0){
            String s = br.readLine();
            mp.put(s,mp.get(s)+1);
        }
        str.append("AC x "+mp.get("AC")+"\n");     
        str.append("WA x "+mp.get("WA")+"\n");
        str.append("TLE x "+mp.get("TLE")+"\n");
        str.append("RE x "+mp.get("RE")+"\n");
        
        

        pw.print(str.toString());
        pw.close();
    }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    
}