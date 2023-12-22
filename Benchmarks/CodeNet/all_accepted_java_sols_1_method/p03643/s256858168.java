import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());

    StringBuffer msg = new StringBuffer("ABC");
    msg.append(N);

    System.out.println(msg);

  }
}
