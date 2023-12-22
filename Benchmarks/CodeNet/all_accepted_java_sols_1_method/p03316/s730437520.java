import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		String n = sc.next();
		String ans = "Yes";
		int sum = 0;

		for (int i = 0; i < n.length(); i++) {
			sum += Integer.valueOf(n.substring(i, i + 1));
		}
		
		if (Integer.valueOf(n) % sum != 0) {
			ans = "No";
		}
		
		
		System.out.println(ans);

		sc.close();
	}
}
