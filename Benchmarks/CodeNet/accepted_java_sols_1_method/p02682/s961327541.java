import java.util.Scanner;

public class Main {
	public static void main(String[] args ) {
		Scanner input = new Scanner(System.in);

		int A = input.nextInt();
		int B = input.nextInt();
		int C = input.nextInt();

		int K = input.nextInt();

		input.close();

		int aNum = 0;
		int bNum = 0;
		int cNum = 0;


		if(A < K ) {
			aNum = A;

			if(B < K - A) {

				bNum = B;

				cNum = K - A - B;

			}else {

				bNum = K - A;

			}

		}else {

			aNum = K;

		}

		System.out.println(aNum - cNum);

	}


}