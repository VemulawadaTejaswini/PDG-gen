import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    String[] s = new String[N];
    for (int i = 0; i < N; i++) {
      char[] ch = scanner.next().toCharArray();
      Arrays.sort(ch);
      s[i] = new String(ch);
    }
    Arrays.sort(s);

    long count = 0;
    for (int i = 0; i < N - 1;) {
      int j = i;
      while (j < N && s[i].equals(s[j])) j++;
      long n = j - i;
      count += n * (n - 1) / 2;
      i = j;
    }
    System.out.println(count);
  }
}
