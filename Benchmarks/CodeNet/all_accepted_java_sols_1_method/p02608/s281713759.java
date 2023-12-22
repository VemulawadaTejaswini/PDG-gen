import java.util.Scanner;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int f[] = new int[n];

    for(int i = 0; i < n; i++) {
      f[i] = 0;
    }

    double k = Math.sqrt(n-2) -1;

    for(int x = 1;x < k; x++) {
      for(int y = 1; y < k; y++) {
        for(int z = 1; z < k; z++) {
          int l = x*x + y*y + z*z + x*y + y*z + z*x;
          if(l <= n) f[l-1]++;
        }
      }
    }

    for(int i = 0; i < n; i++) {
      System.out.println(f[i]);
    }
  }
}
