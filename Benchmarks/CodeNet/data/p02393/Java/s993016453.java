import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) throws java.lang.Exception
	 {
		Scanner scan = new Scanner(System.in);



		int [] su  = new int[3];
		su[0] = (int)scan.nextInt();
		su[1] = (int)scan.nextInt();
		su[2] = (int)scan.nextInt();
		Arrays.sort(su);
		for (int i = 0; i < su.length ; i++) {
			System.out.print(su[i]);

			if( i >= su.length - 1) {
				break;
			}
			System.out.print(" ");

		}
			
		scan.close();
	 }

}

