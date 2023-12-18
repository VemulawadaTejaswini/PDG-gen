
import java.util.*;

public class Main {

	public static void main(String[] args) {

		// 入力
		Scanner sc = new Scanner(System.in);
		int animal = Integer.parseInt(sc.next());
		int leg = Integer.parseInt(sc.next());

		// 例えばanimal=3, leg=8 なら、つる２かめ１

		for (int turu = 0; turu <= 100; turu++) {

			int kame = animal - turu;

			if (turu * 2 + kame * 4 == leg) {
				System.out.println("Yes");
				return;
			}
		}
		
		System.out.println("No");
	}

}
