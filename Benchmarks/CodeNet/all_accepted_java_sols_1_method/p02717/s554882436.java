
import java.util.*;

// A - ABC Swap
// 練習としてやってみる。2020/4/12
public class Main {

	public static void main(String[] args) {

		// スペース区切りの整数３つ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		// 箱Ａと箱Ｂを入れ替える
		int tmp;
		tmp = a;
		a = b;
		b = tmp;

		// 箱Ａと箱Ｃを入れ替える
		tmp = a;
		a = c;
		c = tmp;

		System.out.println(a + " " + b + " " + c);

	}

}
