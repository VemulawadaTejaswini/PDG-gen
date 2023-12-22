import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] a) {


		Scanner sc = new Scanner(System.in);



		int fiveNum [] = new int [5];

		for(int i = 0; i < 5; i++) {
			int line = sc.nextInt();
			fiveNum[i] = line;
		}

		Arrays.sort(fiveNum);



		System.out.println(fiveNum[4] + " " + fiveNum[3] + " " + fiveNum[2] + " " + fiveNum[1] + " " + fiveNum[0]);

	}
}