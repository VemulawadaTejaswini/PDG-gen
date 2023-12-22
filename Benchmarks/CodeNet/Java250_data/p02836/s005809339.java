import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    String s = stdIn.next();
    String[] str = s.split("");
    int n = s.length();
    int count = 0;

    for (int i = 0; i < n / 2; i++) {
      if (!str[i].equals(str[n - i - 1])) {
        count++;
      }
    }

    System.out.println(count);
  }
}
