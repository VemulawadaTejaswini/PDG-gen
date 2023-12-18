import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		// 入力
		Scanner sc = new Scanner(System.in);
		int inputA = sc.nextInt();
		int inputB = sc.nextInt();
		sc.close();
		
		int c = inputB - inputA;
		int sum = 0;
		for (int i = c; i>0; i--) {
			sum += i;
		}
		
		System.out.println(sum - c - inputA);
	}
}