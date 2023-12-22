import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A1 = sc.nextInt();
    int A2 = sc.nextInt();
    int A3 = sc.nextInt();
    int max = Math.max(Math.max(A1,A2),Math.max(A2,A3));
    int min = Math.min(Math.min(A1,A2),Math.min(A2,A3));
    int mid = A1 + A2 + A3 - min -max;
    System.out.println(Math.abs(min-mid) + Math.abs(mid-max));
  }
}