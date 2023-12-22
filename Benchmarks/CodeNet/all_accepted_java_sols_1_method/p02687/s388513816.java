import java.util.*;
import java.io.*;
public class Main{

     public static void main(String []args) throws IOException{
       
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       String a = br.readLine();
       
       if(a.compareTo("ABC") == 0)
       System.out.println("ARC");
       else System.out.println("ABC");
     }
}