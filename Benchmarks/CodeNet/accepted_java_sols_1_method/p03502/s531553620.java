import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int n = x;
		int mod = 0;
		for (; ;) {
			mod = mod + n%10;
			n = n/10;
			if (n==0) {
				break;
			}
		}
		if (x%mod==0) {
			System.out.println("Yes");			
		} else {
			System.out.println("No");
		}
	}
}
