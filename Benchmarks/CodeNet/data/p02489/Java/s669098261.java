import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num[] = new int[100];
		int i = 0;
		int j = 0;

		while (true) {
			num[i] = sc.nextInt();
			if (i > 100 || num[i] == 0)
				break;
			i++;
		}

		while (j < i) {
			System.out.println("Case " + (j + 1) + ": " + num[j]);
			j++;
		}
	}
}