import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] line = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
		int[] A_line = new int[line[0]];
		int[] B_line = new int[line[1]];
		int[] M_line = new int[3];

		int Amin = 1000000000;
		int Bmin = 1000000000;
		int let =0;

		Main main = new Main();


		for (int i = 0; i < line[0]; i++) {
			A_line[i] = sc.nextInt();
			if (Amin > A_line[i]) {
				Amin = A_line[i];
			}
		}

		for (int i = 0; i < line[1]; i++) {
			B_line[i] = sc.nextInt();
			if (Bmin > B_line[i]) {
				Bmin = B_line[i];
			}
		}

		int min = Amin+Bmin;


		for (int i = 0; i < line[2]; i++) {
			M_line[0] = sc.nextInt();
			M_line[1] = sc.nextInt();
			M_line[2] = sc.nextInt();
			let = A_line[M_line[0] - 1] + B_line[M_line[1] - 1] - M_line[2];
			if (let < min) {
				min = let;
			}
		}
		sc.close();

		System.out.println(min);
	}
}