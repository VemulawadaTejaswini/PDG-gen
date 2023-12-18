import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String s1 = sc.next();
			if (s1.equals("-"))
				break;
			int l = s1.length();
			int n = sc.nextInt();
			int sum = 0;
			for (int i = 0; i < n; i++)
				sum += sc.nextInt();
			while (sum > l)
				sum -= l;
			String s2 = s1.substring(sum, l - 1);
			s2 += s1.substring(0, sum - 1);
			System.out.println(s2);
		}
	}
}