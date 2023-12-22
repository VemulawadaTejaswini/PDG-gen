import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] temp = scanner.nextLine().split(" ");
		int n = Integer.parseInt(temp[0]);

		String[] numb      = scanner.nextLine().split(" ");
		int[] list = new int[n];

		for(int i = 1; i < n; i++) {

			list[Integer.parseInt(numb[i]) - 1] = i;

		}


		for(int x : list) {

			System.out.println(x + 1);
		}

	}
}
