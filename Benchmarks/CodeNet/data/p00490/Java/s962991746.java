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
		int temp;
		int max = 0;
		
		for (i = 0; i < n; i++) {
			d[i] = sc.nextInt();
		}
		
		for (i = 0; i < n - 1; i++) {
			for (j = 1; j < n; j++) {
				if (d[i] < d[j]) {
					temp = d[i];
					d[i] = d[j];
					d[j] = temp;
				}
			}
		}
		
		int sum, cal, money, calorie;
		
		for (i = 0; i < n; i++) {
			sum = 0;
			for (j = 0; j < i; j++) {
				sum += d[j];
				cal = c + sum;
				money = a + i * b;
				calorie = cal / money;
				
				if (max < calorie) {
					max = calorie;
				}
			}
		}
		
		System.out.println(max);
		
	}

}