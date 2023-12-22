import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int[] g = new int[5];
	static int average = 0;

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			g[i] = sc.nextInt();
				if (g[i] < 40) {
					g[i] = 40;
				}
				average += g[i];
		}
		System.out.println(average / 5);
	}

}
