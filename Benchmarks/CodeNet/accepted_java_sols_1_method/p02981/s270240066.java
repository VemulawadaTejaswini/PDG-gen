import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 人数：N
		int numN = sc.nextInt();
		// 電車１人当たり：A円
		int trainA = sc.nextInt();
		// タクシーN人：B円
		int taxiSumB = sc.nextInt();

		int trainSumA = numN*trainA;
		System.out.println((taxiSumB < trainSumA) ? taxiSumB : trainSumA);
		sc.close();
	}
}