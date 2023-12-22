import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    N %= 10;
    int[] a = {2,4,5,7,9};
    int[] b = {0,1,6,8};
    int[] c = {3};
    for (int x:a) {
      if (N == x) System.out.println("hon");
    }
    for (int x:b) {
      if (N == x) System.out.println("pon");
    }
    for (int x:c) {
      if (N == x) System.out.println("bon");
    }
  }
}