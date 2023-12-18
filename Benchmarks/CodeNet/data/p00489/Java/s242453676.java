import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc = new Scanner (System.in);
		
		int n, n2;
		
		n = sc.nextInt();
		
		n2 = n * (n - 1) / 2;
		
		int [] team = new int [n];
		
		int i, j;
		int a, b, c, d;
		
		for (i = 0; i < n2; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			d = sc.nextInt();
			
			if (c > d) {
				team[a - 1] += 3;
			} else if (c < d) {
				team[b - 1] += 3;
			} else {
				team[a - 1] += 1;
				team[b - 1] += 1;
			}
		}
		
		for (i = 0; i < n; i++) {
			int count = 1;
			for (j = 0; j < n; j++) {
				if (team[i] < team[j]) {
					count++;
				}
			}
			System.out.println(count);
		}
		

	}

}