import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int ans = 0;
		for (int i = 0;; i++) {
			if ((double)n >= Math.pow(2, i)) {
				continue;
			}else{
				ans = (int)Math.pow(2, i-1);
				break;
			}
		}
		
		System.out.println(ans);
		scanner.close();
	}
}