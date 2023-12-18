import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String ans = "No";
	if (N % 7 == 4) {
      ans = "Yes";
    } else if (N % 7 == 0) {
      ans = "Yes";
    } else if (N % 4 == 0) {
      ans = "Yes";
    } else if (N % 7 == 1 && N > 1) {
      ans = "Yes";
    } else if (N % 7 == 5 && N > 5) {
      ans = "Yes";
    }
    System.out.println(ans);
  }
}
