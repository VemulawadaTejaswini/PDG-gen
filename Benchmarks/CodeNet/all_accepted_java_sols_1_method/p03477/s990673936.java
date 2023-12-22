import java.util.*;
public class Main {
	public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
      int A = sc.nextInt(), B = sc.nextInt(), 
          C = sc.nextInt(), D = sc.nextInt();
      int left = A+B, right = C+D;
      String ans = (left > right)?"Left" : (left < right)?"Right" : "Balanced";
      System.out.println(ans);
    }
}