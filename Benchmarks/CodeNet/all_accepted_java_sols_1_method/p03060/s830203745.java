import java.util.*;

class Main {
    public static void main(final String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] v = new int[n];
      for (int i = 0; i < n; i++) {
        v[i] = sc.nextInt();
      }
      int[] c = new int[n];
      for (int i = 0; i < n; i++) {
        c[i] = sc.nextInt();
      }
      int ans = 0;
      for (int j = 0; j < n; j++) {
        int sum = v[j] - c[j];
        if (sum > 0) {
          ans += sum;
        } 
      }
      System.out.println(ans);
    }
}