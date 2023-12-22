import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		int max = 0;
		int max_let = 0;
		int ans = 1;
		for (int i = 1; i <= num; i++) {
			int target = i;
			max_let = 0;
			while(true) {
				if (target % 2 > 0) {
					break;
				}
				target = target / 2;
				max_let++;
			}
			if (max < max_let) {
				max = max_let;
				ans = i;
			}
		}
		System.out.println(ans);
	}
}
