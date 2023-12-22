import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int[] coin = new int[3];
		for(int i = 0; i < 3; i++) {
			coin[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		for(int t = 0; t <= coin[0]; t++) {
			for(int j = 0; j <= coin[1]; j++) {
				for(int k = 0; k <= coin[2]; k++) {
					int sum = 500 * t + 100 * j + 50 * k;
					if(sum == x) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}