import java.io.*;
import java.util.*;
import java.lang.Math;
 
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader re =
         new BufferedReader(new InputStreamReader(System.in));       
        String line = re.readLine();       
         
        double r = Double.valueOf(line);       
        
        double square= r * r * Math.PI;
        double circle= 2 * r * Math.PI;
        
        System.out.printf("%.5f %.5f \n",square,circle);
        re.close();
    }
}