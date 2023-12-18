import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int d = sc.nextInt();
		int n = sc.nextInt();
		double ans = 0;
      
      if (n == 100) {
      n++;
      }

		ans = Math.pow(100, d) * n;

		System.out.println((int)ans);

		sc.close();
	}
}
