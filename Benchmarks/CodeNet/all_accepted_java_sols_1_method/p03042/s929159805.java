import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] s = scanner.next().toCharArray();
    int left = (s[0] - '0') * 10 + (s[1] - '0');
    int right = (s[2] - '0') * 10 + (s[3] - '0');

    boolean p1 = left >= 1 && left <= 12;
    boolean p2 = right >= 1 && right <= 12;
    if (p1 && p2) System.out.println("AMBIGUOUS");
    else if (!p1 && p2) System.out.println("YYMM");
    else if (p1 && !p2) System.out.println("MMYY");
    else System.out.println("NA");
  }
}
