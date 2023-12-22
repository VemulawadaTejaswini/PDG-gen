import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int d = sc.nextInt();
      double num = (double)n/(2*d+1);
      double x = Math.ceil(num);
      int y = (int) x;
      System.out.println(y);
    }
}