import java.util.Scanner;

public class Main {
	void run() {
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			int n = scan.nextInt();
			max = Math.max(max, n);
			min = Math.min(min, n);
		}
		int k = scan.nextInt();
		System.out.println((k >= (max - min) ? "Yay!" : ":("));
	}
    public static void main(String[] args) {
    	new Main().run();
    }
}
