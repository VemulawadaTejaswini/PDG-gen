import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();
      int B = sc.nextInt();
      int T = sc.nextInt();
      int C = (int)((T+0.5)/A);
      System.out.println(C*B);
    }
}