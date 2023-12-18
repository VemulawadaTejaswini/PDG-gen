import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			int Z = sc.nextInt();

			int i = 0;
			while (true) {
				if (X < (Y * i + (Z * (i + 1)))) {
					i--;
					break;
				}
				i++;
			}
			System.out.println(i);
		}
	}
}
