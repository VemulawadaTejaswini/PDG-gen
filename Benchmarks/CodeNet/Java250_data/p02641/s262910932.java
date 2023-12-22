import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int numlength = sc.nextInt();
		boolean[] numbers = new boolean[101];

		for (int i = 0; i < numlength; i++) {
			numbers[sc.nextInt()] = true;
		}

		for (int i = 0; i < numlength + 1; i++) {
			if (numbers[number - i] == false) {
				System.out.println(number - i);
				return;
			} else if(number + i == 101){
				System.out.println(101);
				return;
			}else if (numbers[number + i] == false) {
				System.out.println(number + i);
				return;
			}
		}

	}

}