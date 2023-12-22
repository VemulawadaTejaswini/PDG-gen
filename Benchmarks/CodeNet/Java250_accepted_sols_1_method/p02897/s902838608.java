import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Nの入力
		double N = sc.nextDouble();
		
		// 奇数の数
		double odd = Math.ceil(N/2);
		double probability = odd / N;
		
		// 結果の出力
		System.out.println(probability);
		
		sc.close();
	}

}
