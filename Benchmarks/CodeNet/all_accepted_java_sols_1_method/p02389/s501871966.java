import java.lang.*;
import java.util.*;
  
class Main{
   public static void main(String[] args){
     Scanner stdId = new Scanner(System.in);
     int a = stdId.nextInt(); 
		 int b = stdId.nextInt();
     System.out.println((a*b) + " " + (a+a+b+b));
  }
}