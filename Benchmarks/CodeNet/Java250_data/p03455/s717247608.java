import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      double x = (double) (a*b)/2;
      if(x == (a*b)/2 ) System.out.println("Even");
      else System.out.println("Odd");
    }
}
