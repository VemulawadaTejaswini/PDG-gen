import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if (n==0) {
			System.out.println(0);
			System.exit(0);
		}
		StringBuilder ans = new StringBuilder();
		for (int i=0; n!=0; i++){
			int rem = Math.abs(n%2);
			ans.insert(0, rem);
			n = -((n-rem)/2);
		}
		System.out.println(ans.toString());

	}
}