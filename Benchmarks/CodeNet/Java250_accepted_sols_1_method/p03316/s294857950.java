import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String str = String.valueOf(n);

		int total = 0;
		for (int i = 0; i < str.length(); i++) {
			total += Integer.valueOf(str.substring(i, i+1));
		}
		
		String ans = "No";
		if (0 == n%total) {
			ans = "Yes";
		}
		System.out.println(ans);

		sc.close();
	}
}