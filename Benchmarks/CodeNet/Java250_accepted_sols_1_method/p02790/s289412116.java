import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	// 入力

	int a = sca.nextInt();
	int b = sca.nextInt();


	if(a > b) {
		for(int i = 1; i <= a; i++) {
			System.out.print("" + b);
		}
	}
	else {
		for(int i = 1; i <= b; i++) {
			System.out.print("" + a);
		}
	}

	System.out.println("");
	// 後始末
	sca.close();
	}
}