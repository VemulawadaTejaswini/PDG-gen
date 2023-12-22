import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		// 入力
		Scanner sc = new Scanner(System.in);
		int inputFirst = sc.nextInt();
		int inputSecond = sc.nextInt();
		sc.close();
		
		int total = 1;
		for (int i=0; i < inputFirst; i++) {
			total = total * 100;
		}
		
		System.out.println(inputSecond != 100 ? total * inputSecond: total * (inputSecond +1));
	}
}
