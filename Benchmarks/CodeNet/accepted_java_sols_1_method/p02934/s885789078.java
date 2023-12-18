import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int s[] = new int[n];
		for (int i = 0; i < s.length; i++) {
			s[i] = scan.nextInt();
		}
		scan.close();
		float ans = 0;
		for (int i = 0; i < s.length; i++) {
			ans += 1 / (float) s[i];
		}
		
		System.out.println(1/ans);

	}
}