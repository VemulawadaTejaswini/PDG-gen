
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int num = in.nextInt();
		int[] array = new int[num];

		for(int cnt = 0; cnt < num; cnt++){

			array[cnt] = in.nextInt();

		}

		for(num = num-1; num >= 0; num--) {

			if(num != 0) {

				System.out.print(array[num] + " ");

			}else {

				System.out.println(array[num]);
			}
		}

	}

}