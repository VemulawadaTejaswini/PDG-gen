import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		boolean [] prime = new boolean [1000000];
		Arrays.fill(prime, true);
		
		for (int i = 2; i < 1000000; i++) {
			if (prime[i]) {
				for (int j = i * 2; j < 1000000; j += i) {
					prime[j] = false;
				}
			}
		}
		
		Scanner date = new Scanner(System.in);

		int num;
		
		while (date.hasNextInt()) {
			int cnt = 0;
			num = date.nextInt();
			for (int i = 2; i <= num; i++) {
				if (prime[i]) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
		
	
	}

}