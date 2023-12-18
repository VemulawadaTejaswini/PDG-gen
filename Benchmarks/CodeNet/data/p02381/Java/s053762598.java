import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
      int n,total;
      double aa,a,m;
      
      Scanner sc = new Scanner(System.in);
      while (sc.hasNext()) {
        n = sc.nextInt();
        if (n == 0) break;
        int s[] = new int[n];
        total = 0;
        aa = 0;
        a = 0;
        for (int i=0; i<n; i++) {
          s[i] = sc.nextInt();
          total += s[i];
        }
        m = total / (double)n;
        for (int i=0; i<n; i++) {
          aa += (s[i] - m) * (s[i] - m);
        }
        System.out.println(Math.sqrt(aa / n));
      }
    }
}
