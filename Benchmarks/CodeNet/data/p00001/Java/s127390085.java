import java.util.*;

public class Main {
	private int[] mt = new int[10];

	public static void main(String[] args) {
		new Main().run();
	}
	
	private void run() {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			mt[i] = scan.nextInt();
		}
		Arrays.sort(mt);
		for (int i = 9; i > 6; i--) {
			System.out.println(mt[i]);
		}
	}
}