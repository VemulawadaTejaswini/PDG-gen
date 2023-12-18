import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ans = "";
		
		for (int i=6;i < 555555; i+=5) {
			boolean prime = true;
			for (int j=2;j < i;j++) {
				if (i % j == 0) {
					prime = false;
					break;
				}
			}
			if (prime) {
				ans += i + " ";
				n--;
			}
			if (n == 0) break;
		}
		System.out.println(ans.substring(0, ans.length()-1));
	}
}