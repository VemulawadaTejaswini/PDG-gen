import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] S = scanner.next().toCharArray();
    int[] num = new int[S.length + 1];
    int c = 0;
    for (int i = 0; i < S.length; i++) {
      if (S[i] == '<') c++;
      else c = 0;
      num[i + 1] = c;
    }
    c = 0;
    for (int i = S.length - 1; i >= 0; i--) {
      if (S[i] == '>') c++;
      else c = 0;
      num[i] = Math.max(num[i], c);
    }
    long sum = 0;
    for (int value : num) sum += value;
    System.out.println(sum);
  }
}
