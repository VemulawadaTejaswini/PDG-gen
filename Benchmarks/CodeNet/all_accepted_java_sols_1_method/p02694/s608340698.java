import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		
		//入力表示
		long X = scanner.nextLong();
		double P = 100;
		int count =0;
		
		//計算
		while (P < X) {
			P = P *1.01;
			P = Math.floor(P);
			count++;
			
		}
		System.out.println(count);
	}
}