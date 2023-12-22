import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		while(true) {
			int n = sc.nextInt();

			if(n == 0) break;

			int s[] = new int[n];
			double sum = 0;
			double ave;
			double sumb = 0;  //分散の合計
			//int hens;  //標準偏差

			for(int i = 0; i < n; i++) {
				s[i] =  sc.nextInt();
				sum += s[i];
			}

			ave = sum / n;

			for(int i = 0; i < n; i++) {
				sumb += (ave - s[i]) * (ave - s[i]);
			}

			System.out.println(Math.sqrt(sumb / n));
		}
	}

}

