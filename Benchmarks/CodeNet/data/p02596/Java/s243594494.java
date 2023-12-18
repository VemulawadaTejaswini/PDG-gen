import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		
		int num = 7;
		for (int i = 1; i <= 9; i++) {
			
			if (num % k == 0) {
				System.out.println(i);
				return;
			}
			
			num += 7 * (int) Math.pow(10, i);
		}
			
		System.out.println(-1);
		return;
	}
}
