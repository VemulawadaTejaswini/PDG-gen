import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		int count = 0;
		int escape = 0;

		Scanner sc = new Scanner(System.in);

		int inputDigital = sc.nextInt();

		int[] ary = new int[inputDigital];

		for (int setDigital = 0; setDigital < ary.length; setDigital++) {

			ary[setDigital] = sc.nextInt();

		}

		for (;;) {

			for (int searchAry = 0; searchAry < ary.length; searchAry++) {

				if (ary[searchAry] % 2 == 1) {

					escape = 1;
					sc.close();
					System.out.println(count);
					break;

				}

				ary[searchAry] = ary[searchAry] / 2;

			}

			if (escape == 1) {
				break;
			}

			count++;
		}

	}
}