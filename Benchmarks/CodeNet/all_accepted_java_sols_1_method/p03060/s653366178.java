import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int[] v = new int[n];
    int[] c = new int[n];

    for(int i = 0; i<n; i++) {
      v[i] = stdIn.nextInt();
    }

    for(int i = 0; i<n; i++) {
      c[i] = stdIn.nextInt();
    }

    int[] d = new int[n];
    for(int i = 0; i<n; i++) {
      d[i] = v[i] - c[i];
    }

    int ans = 0;
    for(int i = 0; i<n; i++) {
      if(d[i] > 0) {
        ans += d[i];
      }
    }
    System.out.println(ans);
  }
}