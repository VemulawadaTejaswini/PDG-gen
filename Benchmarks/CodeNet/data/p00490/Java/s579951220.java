import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = sc.nextInt();
		
		int [] d = new int [n];
		
		int i, j;
		
		for (i = 0; i < n; i++) {
			d[i] = sc.nextInt();
		}
		
		int calorie, money;
		int max = 0;
		
		money = a + b * 2;
		
		for (i = 0; i < n - 1; i++) {
			for (j = i + 1; j < n; j++) {
				calorie = (int) ((c + d[i] + d[j]) / money);
				if (max < calorie) {
					max = calorie;
				}
			}
		}
		
		System.out.println(max);
		
	}

}