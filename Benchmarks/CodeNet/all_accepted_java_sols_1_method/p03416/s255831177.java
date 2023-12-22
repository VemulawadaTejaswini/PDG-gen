import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();

		int ans = 0;

		for (Integer i = A; i <= B; i++) {
			String s = i.toString();
			StringBuffer sb = new StringBuffer(s);
			String sR = sb.reverse().toString();
			if (s.equals(sR))
				ans++;
		}

		System.out.println(ans);
	}
}