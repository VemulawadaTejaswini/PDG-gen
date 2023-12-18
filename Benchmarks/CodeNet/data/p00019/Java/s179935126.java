
import java.util.Scanner;

class Main{
	public static void main(String[] a) {


		Scanner sc = new Scanner(System.in);

		int suuji[] = new int[20];

		for(int i = 1; i < 21; i++) {
			suuji[i-1] = i;
		}


		int n = sc.nextInt();

		int ans = 1;
		for(int i = n; i > 0; i--) {
			ans = ans * suuji[i-1];
		}

		System.out.println(ans);
	}
}