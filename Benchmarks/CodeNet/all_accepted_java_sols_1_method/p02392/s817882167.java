import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[3];
		for (int i = 0; i < 3; i++) {
			num[i] = sc.nextInt();
		}
		if (num[0] < num[1]) {
			if (num[1] < num[2]) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}

		} else {
			System.out.println("No");
		}
		sc.close();
	}

}
