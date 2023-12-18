import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//入力
		int N = sc.nextInt();

		ArrayList<Long> LucasArray = new ArrayList<Long>();

		LucasArray.add((long)2);
		LucasArray.add((long)1);
		if (N > 1) {
			for (int i = 0; i < N; i++) {
				Long tmp = LucasArray.get(i) + LucasArray.get(i+1);
				LucasArray.add(tmp);
			}
		}
			System.out.print(LucasArray.get(N));
	}
}