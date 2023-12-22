import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] a = new int[5];
    for (int i = 0; i < 5; i++) a[i] = sc. nextInt();
    System.out.println(a[4]-a[0] <= sc.nextInt() ? "Yay!" : ":(");
  }
}