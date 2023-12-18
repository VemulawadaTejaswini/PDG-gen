import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int sum = 0;
		for(int i = 0 ; i < n - 1 ; i++) {
			if(s.charAt(i + 1) == 'E') sum++;
		}
		int ans = sum;
		for(int i = 0 ; i < n - 1 ; i++) {
			if(s.charAt(i) != s.charAt(i + 1));
			else if(s.charAt(i) == s.charAt(i + 1) && s.charAt(i) == 'E') sum--;
			else if(s.charAt(i) == s.charAt(i + 1) && s.charAt(i) == 'W') sum++;
			ans = Math.min(ans, sum);
		}
		System.out.println(ans);
	}
}
