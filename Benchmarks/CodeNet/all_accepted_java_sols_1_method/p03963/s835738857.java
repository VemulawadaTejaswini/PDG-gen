import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      long x = (long) k*(long)Math.pow(k-1,n-1);
      System.out.println(x);
    }
}