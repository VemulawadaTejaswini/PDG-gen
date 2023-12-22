import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int A,B,T;
      A = sc.nextInt();
      B = sc.nextInt();
      T = sc.nextInt();
      int result = (T / A) * B;
      System.out.println(result);
    }
}
