import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		//入力の読み込み
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();  //整数Nの値
		int base = sc.nextInt();  //進数Kの値
		int i = 0;

		//基数の値^iごとに桁が増える
		while(Math.pow(base, i) <= n) {
			i++;
		}
		System.out.print(i);
	}
}