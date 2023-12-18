import java.util.Scanner;

/**
 * @author yamamotoa
 *
 */
public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int ans;
		int num;
		while(sc.hasNext()) {
			num = sc.nextInt();
			ans = 0;

			for(int a = 0; a < 10; a++) {
				for(int b = 0; b < 10; b++) {
					for(int c = 0; c < 10; c++) {
						for(int d = 0; d < 10; d++) {
							if(a + b + c + d == num) {
								ans++;
							}
						}
					}
				}
			}
			System.out.println(ans);
		}

	}

}