import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int rectangular = 0;
		int dimond = 0;

		while(sc.hasNext()) {
			String[] numbers = sc.nextLine().split(",");

			int[] number = new int[3];
			for(int $ = 0; $ < 3; $++) {
				number[$] = Integer.parseInt(numbers[$]);
			}

			if(number[0] * number[0] == number[1] * number[1] + number[2] * number[2]) {
				rectangular++;
			} else if(number[1] == number[2]) {
				dimond++;
			}
		}

		System.out.println(rectangular);
		System.out.println(dimond);

	}

}