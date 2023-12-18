import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] S = scanner.next().toCharArray();
    int res = 0;
    for (char ch : S) {
      switch (ch) {
        case '+':
          res++;
          break;
        case '-':
          res--;
          break;
      }
    }
    System.out.println(res);
  }
}
