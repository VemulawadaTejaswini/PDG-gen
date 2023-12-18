import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		//標準入力取得
		int num = sc.nextInt();
		int d[] = new int[num];
		for (int i = 0; i < num; i++) {
			d[i] = sc.nextInt();
		}

		int total = 0;
		for (int i = 0; i < num - 1; i++) {
			for (int j = i + 1; j < num; j++) {
				total = total + d[i] * d[j];
			}
		}
		System.out.println(total);

		sc.close();
	}
}
