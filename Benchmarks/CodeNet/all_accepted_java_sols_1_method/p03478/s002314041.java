import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		Long sum = 0L;
		for(int i = 1; i <= n; i++) {
			String s = String.valueOf(i);
			Long ssum = 0L;
			for(char c : s.toCharArray()) {
				ssum += Integer.valueOf(String.valueOf(c));
			}
			if(a <= ssum && b >= ssum) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}