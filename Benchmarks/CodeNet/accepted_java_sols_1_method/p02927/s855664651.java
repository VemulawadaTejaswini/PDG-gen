import java.util.Scanner;

//第一回日本最強プログラマー学生選手権-予選-
//A	Takahashi Calendar
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = Integer.parseInt(sc.next());
		int D = Integer.parseInt(sc.next());
		sc.close();

		long ans = 0;
		for (int d = 22; d <= D; d++) {
			int d2 = (d % 10);
			int d1 = (d - d2) / 10;
			int dxd = 0;
			if (d1 >= 2 && d2 >= 2) {
				dxd = d1 * d2;
			}
			if (dxd > 0 && dxd <= M) {
				ans++;
			}
		}

		System.out.println(ans);
	}
}
