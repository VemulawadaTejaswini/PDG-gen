import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	// 入力
	long a = sca.nextLong();
	long b = sca.nextLong();
	long k = sca.nextLong();

	// 処理
	a = a - k;
	if(a < 0) {
		k = -a;
		b = b - k;
		a = 0;
		if(b < 0) {
			b = 0;
		}
	}

	// 出力
	System.out.print(a);
	System.out.print(" ");
	System.out.println(b);

	// 後始末
	sca.close();
	}
}