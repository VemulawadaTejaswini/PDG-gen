
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] list = new int[5];
		int max = 0;
		int plus = 0;
		for(int i = 0; i < 5; i++) {

			list[i] = Integer.parseInt(scan.nextLine());

			if(list[i] % 10 != 0) {
				plus = 10 - list[i] % 10;
				list[i] += plus;
				max = Math.max(max, plus);
			}
		}

		System.out.println(list[0] + list[1] + list[2] + list[3] + list[4] - max);
	}
}
