mport java.util.*;
public class Main {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
	       String[] ary = sc.nextLine().split("[ ,\\.]");
	       int i=0,j;
	       for(String o : ary) {
		   j=o.length();
		   if(j>2&&j<7){
		   if(i==0)
		       i=1;
		   else
		       System.out.print(" ");
		   System.out.print(o);
		   }
	       }
	       System.out.println();
   }
}