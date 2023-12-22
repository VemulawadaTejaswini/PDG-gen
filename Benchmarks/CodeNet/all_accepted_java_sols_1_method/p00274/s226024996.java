import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		while (true) {
			final int N = sc.nextInt();
			
			if(N == 0){
				break;
			}
			
			int[] count = new int[N];
			for (int i = 0; i < N; i++) {
				count[i] = sc.nextInt();
			}

			boolean has_over_two = false;
			int tring = 0;
			for (int i = 0; i < N; i++) {
				if (count[i] >= 1) {
					tring++;

					if (count[i] >= 2 && !has_over_two) {
						has_over_two = true;
					}
				}
			}

			System.out.println(has_over_two ? (tring + 1) + "" : "NA");
		}
	}

}