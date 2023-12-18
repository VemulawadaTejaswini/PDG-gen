import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		int c_k = k;
		int seven = 0;
		int ans = 0;

		c_k %= 10;

		if(k % 2 == 0 ) {
			System.out.println(-1);

		}else {
			if(c_k == 1 || c_k == 3 || c_k == 7) {
				for(int i = 1;;i++) {
					seven = (seven * 10) + 7;

					if(seven % k == 0) {
						ans = i;
						break;
					}
				}
				System.out.println(ans);
			}else {
				System.out.println(-1);
			}
		}
	}
}
