import java.util.Scanner;
public class Main {
   public static void main(String[] args){
	   Scanner scanf = new Scanner(System.in);
	   int a,b;
	   a = scanf.nextInt();
	   b = scanf.nextInt();
	   System.out.print(a/b + " " + a%b + " ");
	   System.out.printf("%.5f\n",(double)a/b);
   }
}