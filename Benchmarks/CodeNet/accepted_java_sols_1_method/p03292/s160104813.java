import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();
    System.out.println(Math.max(Math.max(A, B), C) - Math.min(Math.min(A, B), C));
  }
}