import java.util.*;

public class Main {

	public static void main(String[] args) {

		// 入力
		Scanner sc = new Scanner(System.in);
		int x[] = new int[6];
		x[1] = Integer.parseInt(sc.next());
		x[2] = Integer.parseInt(sc.next());
		x[3] = Integer.parseInt(sc.next());
		x[4] = Integer.parseInt(sc.next());
		x[5] = Integer.parseInt(sc.next());

		// 0になっているのを見つける
		for (int i = 1; i <= 5; i++) {
			if (x[i] == 0) {
				System.out.println(i);
			}
		}
	}

}