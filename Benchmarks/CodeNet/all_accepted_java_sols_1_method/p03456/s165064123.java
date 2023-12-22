import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String x = a + b;
		int y = Integer.parseInt(x);
		String ans = "No";
		for(int i = 0;i < 1000;i++) {
			if(i * i == y) {
				ans = "Yes";
			}
		}
		System.out.println(ans);
	}
}