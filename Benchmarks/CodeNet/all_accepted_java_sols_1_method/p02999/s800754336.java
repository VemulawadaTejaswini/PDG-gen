import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cntNums[] = new int[2];


		for(int i = 0; i <= 1; i++){

			int inputNums = sc.nextInt();
			cntNums[i] = inputNums;

		}

		if (cntNums[0] < cntNums[1]) {
			System.out.println(0);
		} else {
			System.out.println(10);
		}

	}

}
