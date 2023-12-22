import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int min = a;
		int max = a;
		long x = a;
		for (int i = 1; n > i; ++i) {
			a = sc.nextInt();

			//標準入力から数値を受け取りｎ、aにそれぞれ代入
			//minがaより大きいときminにaを代入する
			if (min > a) {
				//maxがaより小さいときmaxにaを代入する
				min = a;
			}
			if (max < a) {
				max = a;
			}
			x = x + a;
		}
		System.out.println(min + " " + max + " " + x);
	}

}

