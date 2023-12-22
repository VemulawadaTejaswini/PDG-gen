import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.nextLine());


		String temp1 = scanner.nextLine();
		String[] temp = temp1.split(" ");
		int list[] = new int[n];

		int max = 0;
		int total = 0;
		for(int i = 0; i < n; i++ ) {
			list[i] = Integer.parseInt(temp[i]);

			total += list[i];
			max = Math.max(max, list[i]);
		}

		if(total - max - max > 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
