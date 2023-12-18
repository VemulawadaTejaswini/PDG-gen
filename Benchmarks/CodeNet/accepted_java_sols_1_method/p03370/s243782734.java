import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int []m = new int[n];
		int sum1 = sc.nextInt();
		int ans = 0;
		
		for(int i = 0; i < n; i++) {
			m[i] = sc.nextInt();
			sum1 = sum1 - m[i];
			ans++;
		}
			Arrays.sort(m);
			ans += sum1 / m[0];
			
			System.out.println(ans);
	}

}
