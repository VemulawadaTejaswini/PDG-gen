import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");

		int num1 = Integer.parseInt(input[0]);
		int num2 = Integer.parseInt(input[1]);
		int num3 = Integer.parseInt(input[2]);

		int count = 0;

		for (int i = num1 ; i < num2+1; i++) {
			if(i % num3 == 0) {
				count++;
			}
		}

		System.out.println(count);

	}

}
