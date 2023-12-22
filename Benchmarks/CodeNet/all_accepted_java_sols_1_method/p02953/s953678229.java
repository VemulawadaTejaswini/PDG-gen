
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		long[] height = new long[n];
		for(int i = 0; i < n; i++) {
			height[i] = s.nextLong();
		}
		s.close();
		String judge = "Yes";
		for(int i = n - 1; i > 0 ; i--) {
			if(height[i-1] > height[i]) {
				if(height[i-1] -1  > height[i]) {
				judge = "No";
				break;
				}else {
					height[i - 1]--;
				}
			}
		}
		System.out.println(judge);
	}

}
