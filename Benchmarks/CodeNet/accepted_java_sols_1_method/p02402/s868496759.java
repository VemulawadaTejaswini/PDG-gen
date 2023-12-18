import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a = 0;
		int min = 0, max = 0;
		long sum = 0;

		for(int i = 0; i < n; i++) {
			a = sc.nextInt();
			if(i == 0) {
				min = a;
				max = a;
			}

			min = Math.min(min, a);
			max = Math.max(max, a);
			sum += a;
		}
		System.out.println(min + " " + max + " " + sum);

	}

}
