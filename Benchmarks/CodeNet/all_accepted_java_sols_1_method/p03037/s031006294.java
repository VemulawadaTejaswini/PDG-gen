import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int N = 0;
		int M = 0;
		String s;
		Scanner sc = new Scanner(System.in);
		N = Integer.parseInt(sc.next());
		M = Integer.parseInt(sc.next());
		int i;
		int temp;
		int max = 100000, min = 0;
		for (i = 0; i < M; i++) {
			temp = Integer.parseInt(sc.next());
			if (min < temp) {
				min = temp;
			}
			temp = Integer.parseInt(sc.next());
			if (max > temp) {
				max = temp;
			}
		}
		int dif = max - min + 1;
		if (dif <= 0) {
			System.out.println("0");
		} else if (dif <= N) {
			System.out.println(dif);
		} else {
			System.out.println(N);
		}

	}

}