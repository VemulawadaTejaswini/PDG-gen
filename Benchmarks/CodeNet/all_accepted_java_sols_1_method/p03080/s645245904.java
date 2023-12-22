import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    char[] s = scanner.next().toCharArray();
    int red = 0;
    for (int i = 0; i < s.length; i++) {
      if (s[i] == 'R') red++;
    }
    int blue = N - red;
    if (red > blue) System.out.println("Yes");
    else {
      System.out.println("No");
    }
  }
}
