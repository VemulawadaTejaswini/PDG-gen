import java.util.*;

public class Main {	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		for(int i = 0; i < n; i++) {
			int temp = sc.nextInt();
			int cout = 0;
			while(temp % 2 == 0) {
				temp /= 2;
				cout++;
			}
			ans += cout;
		}
		System.out.println(ans);
	}
}