import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = Integer.parseInt(sc.next());
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());


    String msg ="B";
    if (Math.abs(x-a) < Math.abs(x-b)  ) {
      msg = "A";
    }

    System.out.println(msg);

  }
}
