import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] line = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
		int[] A = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
		int ind =0;
		int lowerans = 0;
		int upperans = 0;
		int con =1;

		//X ～ 0
		while (con < line[2] && ind < line[1]) {
			if (A[ind] == con) {
				lowerans++;
				ind++;
			}
			con++;
		}

		//X ～ N
		con = line[2] + 1;
		while (con < line[0] && ind < line[1]) {
			if (A[ind] == con) {
				upperans++;
				ind++;
			}
			con++;
		}

		if (lowerans <= upperans) {
			System.out.println(lowerans);
		}else {
			System.out.println(upperans);
		}

	}
}
