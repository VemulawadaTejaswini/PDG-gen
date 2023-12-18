import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String ans = "";
		while(N != 0) {
			//Nを2で割ったあまりも求める
			int r = N % 2;
			//Nがマイナスだとｒもマイナスになることがあるので２を足す
			if (r < 0) r += 2;

			//Nからあまりを取り除いて-2で割る
			N = (N - r) / (-2);

			ans = (char)('0' + r) + ans;
		}

		if (ans == "") ans = "0";


		System.out.println(ans);
	}
}