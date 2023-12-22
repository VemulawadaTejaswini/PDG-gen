import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int count = 0;

		for (int aIdx = 0; aIdx <= a ; aIdx ++) {
			for(int bIdx = 0; bIdx <= b ; bIdx ++) {
				for(int cIdx = 0; cIdx <= c ; cIdx ++) {
					if(x== (aIdx * 500) + (bIdx * 100) + (cIdx * 50)) {
						count += 1;
					}
				}
			}
		}
		System.out.print(count);
		}
}
