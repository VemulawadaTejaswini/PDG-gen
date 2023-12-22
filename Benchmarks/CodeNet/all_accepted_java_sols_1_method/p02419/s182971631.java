import java.util.Scanner;
import java.io.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       String w = sc.next().toLowerCase();
       int count = 0;
       while(true){
    	   String s = sc.next();
    	   if(s.equals("END_OF_TEXT")) {
    		   break;
    	   }
    	   if(s.toLowerCase().equals(w)) {
    		   count++;
    	   }
       }
       sc.close();
       System.out.println(count);
    }
}
