
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[3];
		int n = sc.nextInt();
		long ans = 1;
		for (int i=0;i<n;i++) {
			int count = 0;
			int place = 0;
			int input = sc.nextInt();
			for (int j=0;j<3;j++) {
				if (num[j]==input) {
					count++;
					place=j;
				}
			}
          	num[place]++;
			ans = ans*count%1_000_000_007;
		}
		System.out.println(ans);
	}
}


