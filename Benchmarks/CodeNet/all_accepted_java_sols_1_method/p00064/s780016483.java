//import java.io.*;
import java.util.*;
//import java.math.*;
public class Main {
 
    public static void main(String[] args) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
      //  ArrayList <Double> student= new ArrayList <Double>(); 
//      double [] student =new double [(int)Math.pow(2, 16)-1];
        int sum =0;
     while(scan.hasNext()){
    	 String line = scan.nextLine();
    	 Scanner code = new Scanner(line.replaceAll("\\D"," "));
    	 while(code.hasNextInt())
    	 sum += code.nextInt();
   
     }
     System.out.println(sum);
     }

    }