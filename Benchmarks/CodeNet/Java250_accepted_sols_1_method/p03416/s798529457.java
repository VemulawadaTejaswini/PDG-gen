import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int A = scanner.nextInt();
    int B = scanner.nextInt();

    int total = 0;
    for (int i = A; i <= B; i++) {
      String s = String.valueOf(i);
      StringBuffer sb = new StringBuffer(s);
      String r = new String(sb.reverse());
      if (s.equals(r)) {
        total++;
      }
    }
    System.out.println(total);

  }

}
