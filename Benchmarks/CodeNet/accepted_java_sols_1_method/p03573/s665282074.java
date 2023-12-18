import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] num = new int[3];
		int i = 0;
		while (input.hasNextInt()) {
			num[i++] = input.nextInt();
		}
		if(num[0] == num[1]) {
			System.out.println(num[2]);
		}else if (num[0] == num[2]) {
			System.out.println(num[1]);
		} else {
			System.out.println(num[0]);
		}
	}
}