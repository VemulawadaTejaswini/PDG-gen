import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int sum1 = 0;
		int sum2 = 0;
		while(sc.hasNext()) {
			String[] s = sc.nextLine().split(",");
			cnt++;
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			sum1 += a * b;
			sum2 += b;
		}
		sc.close();
		System.out.printf("%d %d\n", sum1, (sum2 + cnt - 1) / cnt);
	}
}
