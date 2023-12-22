import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int num = 0;

		while ((y + z) * num + z <= x) {
			num++;
		}

		System.out.println(num-1);
	}
}