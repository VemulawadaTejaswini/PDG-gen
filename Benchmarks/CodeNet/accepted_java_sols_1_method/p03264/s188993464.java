import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int K = scan.nextInt();
		scan.close();
		if(K % 2 == 0) {
			int t = K / 2;
			int ans = t * t;
			System.out.println(ans);
		}else {
			int t1 = K / 2;
			int t2 = K / 2 + 1;
			int ans = t1 * t2;
			System.out.println(ans);
		}

	}
}