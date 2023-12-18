import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int maxCount = 0;
		int ans = 0;
		
		for (int i = n; i >= 1; i--) {
			int num = i;
			int cnt = 0;
			
			while(true) {
				if (num % 2 == 0) {
					cnt++;
					num /= 2;
				} else {
					break;
				}
			}
			
			if (cnt >= maxCount) {
				ans = i;
				maxCount = cnt;
			}
		}
		
		System.out.println(ans);
		sc.close();
	}
}