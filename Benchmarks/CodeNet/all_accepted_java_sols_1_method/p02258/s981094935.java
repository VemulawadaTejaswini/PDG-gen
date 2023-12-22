import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] R = new int[n];
    for(int i = 0; i < n; i++) {
      R[i] = sc.nextInt();
    }

    int minv = 2000000000;
    int maxp = -2000000000;
    int t;
    for(int i = 1; i < n; i++) {
      if (R[i - 1] < minv)  minv = R[i - 1];
      t = R[i] - minv;
      if(t > maxp)  maxp = t;
    }

    System.out.println(maxp);

  }
}