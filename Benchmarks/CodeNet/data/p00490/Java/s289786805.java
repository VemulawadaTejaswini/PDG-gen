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
		int calorie;
		int max = 0;
		
		for (i = 0; i < n; i++) {
			d[i] = sc.nextInt();
		}
		
		for (i = 0; i < n - 1; i++) {
			for (j = i + 1; j < n; j++) {
				calorie = (int) ((c + d[i] + d[j]) / (a + b * 2));
				if (max < calorie) {
					max = calorie;
				}
			}
		}
		
		System.out.println(max);
		
	}

}