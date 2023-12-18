
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int array[][] = new int[3][3];
		int a[] = new int[3];
		int b[] = new int[3];
		int c[][] = new int[3][3];


		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				array[i][j] = scan.nextInt();
			}
		}

		a[0] = 0;
		
		b[0] = array[0][0] - a[0];
		b[1] = array[0][1] - a[0];
		b[2] = array[0][2] - a[0];

		a[1] = array[1][0] - b[0];
		a[2] = array[2][0] - b[0];
		
		/*System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
*/
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(array[i][j] != a[i]+b[j]) {
					System.out.println("No");
					System.exit(0);
				}
			}
		}
		System.out.println("Yes");
		
		/*
		  for(int i = 0; i<3;i++) { for (int j = 0; j <3; j++) {
		  System.out.print(array[i][j]); } System.out.println(""); }
		*/
	}

}
