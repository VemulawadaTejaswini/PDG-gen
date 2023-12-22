import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		boolean ans = true;
		if (n % k != 0) {
			ans = false;
		}
		System.out.println(ans ? 0 : 1);
	}

}
