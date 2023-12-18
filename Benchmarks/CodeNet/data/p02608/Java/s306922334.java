import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		ArrayList<Integer> calclist = new ArrayList<Integer>();


		for (int x = 0; x < 100; x++) {
			for (int y = 0; y < 100; y++) {
				for (int z = 0; z < 100; z++) {
					calclist.add(subcalc(x+1, y+1, z+1));
				}
			}
		}

		for (int i = 0; i < N; i++) {
			int idx = i;
			int anscnt = (int) calclist.stream().filter(x -> x == idx + 1).count();
			System.out.println(anscnt);
		}
	}

	private static int subcalc(int x, int y, int z) {
		return x * x + y * y + z * z + x * y + x * z + y * z;
	}

}
