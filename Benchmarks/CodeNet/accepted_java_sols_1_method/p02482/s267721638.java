import java.util.*;
public class Main {
   public static void main(String[] args){
	   Scanner buf = new Scanner(System.in);
	   int a,b;
	   a = buf.nextInt();
	   b = buf.nextInt();
	   if(a == b) System.out.println("a == b");
	   else if(a < b) System.out.println("a < b");
	   else if(a > b) System.out.println("a > b");
   }
}