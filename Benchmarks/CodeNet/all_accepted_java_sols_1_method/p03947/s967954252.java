import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args)  {
    char[] S = sc.next().toCharArray();
    int ans = 0;
    for (int i = 0; i < S.length - 1; i++) {
      if (S[i] != S[i + 1]) ++ans;
    }
    System.out.println(ans);
  }
}
