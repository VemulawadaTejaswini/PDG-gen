import java.util.*;
public class Main {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
	       String[] ary = sc.nextLine().split("[ ,\\.]");
	       int i =0;
	       for(String o : ary) {
		   if(i==0)
		       i=1;
		   else
		       System.out.print(" ");
		   System.out.print(o);
	       }
	       System.out.println();
   }
}