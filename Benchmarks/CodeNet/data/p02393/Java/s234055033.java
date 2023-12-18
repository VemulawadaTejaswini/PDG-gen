import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		int temp = 0;
		Scanner s = new Scanner(System.in);
		int sort[] = new int[3];
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int num3 = s.nextInt();
		s.nextLine();
		sort[0] = num1;
		sort[1] = num2;
		sort[2] = num3;
		if ((num1 >= 1 && num1 <= 10000) && (num2 >= 1 && num2 <= 10000) && (num3 >= 1 && num3 <= 10000)) {
			for (int i = 0; i < sort.length; i++) {
				for (int j = i + 1; j < sort.length; j++) {
					if (sort[i] > sort[j]) {
						temp = sort[i];
						sort[i] = sort[j];
						sort[j] = temp;

					}
				}

			}
			System.out.print(sort[0]);
			System.out.print(" ");
			System.out.print(sort[1]);
			System.out.print(" ");
			System.out.print(sort[2]);
			System.out.println(" ");

		}

	}

}