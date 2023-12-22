import java.util.Scanner;

/**
 * @author ??\???
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		scanner.close();
		
		int ans = 0;
		for (int i = a; i <= b; i++) {
			ans = (c % i == 0) ? ans + 1: ans;
		}
		
		System.out.println(ans);
	}

}