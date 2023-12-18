import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//AtCoder Beginner Contest 130
//B	Bounding
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		sc.nextLine();
		List<Integer> Ls = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			Ls.add(sc.nextInt());
		}
		sc.close();

		int ans = 1;

		int d = 0;
		for (Integer l : Ls) {
			d += l;
			if (d <= X) {
				ans++;
			}
		}

		System.out.println(ans);
	}
}
