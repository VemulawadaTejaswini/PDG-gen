import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int sum[] = new int[1000];
		sum[0] = 1;
		for(int i = 1; i < 1000; i++) {
			sum[i] += sum[i - 1] + (i + 1);
		}
		
		int diff = b - a;
		int ans = 0;
		for(int i = 1; i < 1000; i++) {
			if(diff == sum[i] - sum[i - 1]) {
				ans = sum[i - 1] - a;
				break;
			}
		}
		
		System.out.println(ans);
	}
}
