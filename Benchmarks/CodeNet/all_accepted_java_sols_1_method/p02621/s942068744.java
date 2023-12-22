import java.util.*;

class Main {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    final int a = sc.nextInt();
    System.out.println(a * (1 + a * (1 + a)));
  }
}
