import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int x = N/1000;
		int y = 0;
		if (N%1000 != 0) {
			y = 1000*(x+1) - N;
		} else {
			y = 1000*x - N;
		}
		System.out.println(y);
	}
}
