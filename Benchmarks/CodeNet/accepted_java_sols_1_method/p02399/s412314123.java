import java.io.*;
import java.util.*;
 
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader re =
         new BufferedReader(new InputStreamReader(System.in));       
        String line = re.readLine();       
         
        int cnt=0;
 
        String st[] = line.split(" ",0);
        int a = Integer.parseInt(st[0]);
        int b = Integer.parseInt(st[1]);
       
        
        int d= a / b;
        int r = a % b;
        double f=(double)a/(double)b;
          System.out.print(d +" "+ r +" ");
          System.out.printf("%.5f\n",f);
        re.close();
    }
}