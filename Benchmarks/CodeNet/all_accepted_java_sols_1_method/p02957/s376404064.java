import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
	   Scanner Ahmad=new Scanner(System.in);
	   int x,y;
	   x=Ahmad.nextInt();
	   y=Ahmad.nextInt();
	   if((x+y)%2==0) {
		   System.out.println((x+y)/2);
	   }
	   else {
		   System.out.println("IMPOSSIBLE");
	   }
   }
}
