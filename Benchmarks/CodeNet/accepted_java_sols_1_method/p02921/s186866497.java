import java.util.*;
 
 public class Main {
   	public static void main (String arg[]){
      	Scanner in = new Scanner (System.in);
       	String s = in.nextLine();
      	String t = in.nextLine();
      	
       int count =0;
      for(int i =0; i<3; i++)
      	if (s.charAt(i)==t.charAt(i)){
          count++;
        }
      
      System.out.println(count);
      
      
    }
   
 }