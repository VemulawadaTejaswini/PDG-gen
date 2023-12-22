import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		int i;
		int j;
		int temp;
		int first;
		int second;
		int third;

		int[] mountain = new int[10];

		Scanner sc = new Scanner(System.in);

		for(i = 0; i <10; i++) {

		mountain[i] = sc.nextInt();

		}

		for(i = 0; i <10; i++) {

			for(j = 0; j < 10; j++) {
				if( mountain[i] < mountain[j]) {


					temp = mountain[i];
					mountain[i] = mountain[j];
					mountain[j] = temp;
				}
			}
		}
		first = mountain[0];
		second = mountain[1];
		third = mountain[2];

		for(i = 9; i > 6; i--) {
		System.out.printf("%d",mountain[i] );
		System.out.println("");


		}

	}
}