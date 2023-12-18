//import java.io.*;
import java.util.*;
//import java.math.*;
public class Main {
 
    public static void main(String[] args) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
      //  ArrayList <Double> student= new ArrayList <Double>(); 
//      double [] student =new double [(int)Math.pow(2, 16)-1];
     while(scan.hasNext()){
    	 String [] strs=scan.nextLine().split(",");
    	 int num =Integer.parseInt(strs[0]);
    	 double weight = Double.parseDouble(strs[1]);
    	 double height = Double.parseDouble(strs[2]);
    	 if((weight/Math.pow(height, 2))>=25)
    	 System.out.println(num);
     }

    }
}