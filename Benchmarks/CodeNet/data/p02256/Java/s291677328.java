import java.util.Scanner;

public class Main {
	void run() {
		// 入力
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int mod;
		do {
			mod = a%b;
			a = b;
			b = mod;
		} while(mod != 0);
		// 出力
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}
