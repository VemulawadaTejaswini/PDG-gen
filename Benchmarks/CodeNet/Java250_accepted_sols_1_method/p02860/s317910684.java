import java.util.*;

public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      String S = sc.next();
      
      if (N % 2 == 1) {
        System.out.println("No");
        return;
      }
      
      // 分解したものが一致するか比較
      if (S.substring(0, N/2).equals(S.substring(N/2, N))) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
}
