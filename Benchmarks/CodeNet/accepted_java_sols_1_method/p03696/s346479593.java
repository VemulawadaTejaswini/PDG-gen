import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    char[] S = scanner.next().toCharArray();
    int left = 0;
    int count = 0;
    for (char ch : S) {
      if (ch == ')') {
        if (count <= 0) left++;
        else count--;
      }
      if (ch == '(') count++;
    }
    int right = 0;
    count = 0;
    for (int i = N - 1; i >= 0; i--) {
      char ch = S[i];
      if (ch == '(') {
        if (count <= 0) right++;
        else count--;
      }
      if (ch == ')') count++;
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < left; i++) sb.append('(');
    for (int i = 0; i < N; i++) sb.append(S[i]);
    for (int i = 0; i < right; i++) sb.append(')');
    System.out.println(sb.toString());
  }
}
