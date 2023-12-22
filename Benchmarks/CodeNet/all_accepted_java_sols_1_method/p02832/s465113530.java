import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int next = 1;
		int count = 0;
		int a;
		for (int i = 0; i < n; i++) {
			a = scanner.nextInt();
			if (a == next)
				next++;
			else
				count++;
		}
		System.out.println(next > 1 ? count : -1);
	}

}
