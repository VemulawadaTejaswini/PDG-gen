import java.util.Scanner;

public class sample2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		long ans = 1;

		for(int i = 0;i < n;i++) {
			ans *= scan.nextLong();
		}

		if(ans > (long)Math.pow(10, 18)) {
			System.out.println(-1);
		}else {
			System.out.println(ans);
		}
	}
}