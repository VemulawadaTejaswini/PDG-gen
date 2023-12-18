import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int numArrasy[] = new int[num];

		for (int i = 0; i < num; i++) {

			numArrasy[i] = sc.nextInt();

		}

		int count = 1;
		int tmp = numArrasy[0];

		for (int i = 0; i < num; i++) {

			if (tmp > numArrasy[i]) {
				count++;
			}

			tmp = Math.min(tmp, numArrasy[i]);

		}

		System.out.println(count);

	}

}
