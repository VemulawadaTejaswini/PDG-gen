import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      long x = (long)Math.pow(2,m);
      System.out.println((1900*m+100*(n-m))*x);
    }
}
