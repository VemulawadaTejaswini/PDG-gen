import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int i,j,k;
		while(true) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			if((n == 0 && x == 0) || n < 3 || n > 100) break;
			int cnt = 0;
			for(i = 1; i <= n; i++) {
				for(j = 1; j <= n; j++) {
					for(k = 1; k <= n; k++) {
						if(i < j && j < k && i + j + k == x) cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
	}

}