import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		do {

			String str = sc.nextLine();
			String[] strs = str.split(" ");

			if (strs[0].equals("0") && strs[1].equals("0")) {
				break;
			}

			int[] ints = new int[] {Integer.parseInt(strs[0]), Integer.parseInt(strs[1])};
			Arrays.sort(ints);



	        System.out.println( ints[0] + " " + ints[1] );

		}while(true);
		sc.close();

	}

}

