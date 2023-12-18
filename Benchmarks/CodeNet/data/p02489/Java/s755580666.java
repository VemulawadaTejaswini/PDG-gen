import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vec[] = new int[1000];
		int i = 1;
		while (true) {
			vec[i] = sc.nextInt();
			if (vec[i] == 0)
				break;

		}
		i = 0;
		while (vec[i] != 0) {
			System.out.printf("Case %d: %d", i, vec[i]);
			i++;
		}

	}

}