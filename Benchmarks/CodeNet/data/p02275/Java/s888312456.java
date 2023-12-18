import java.util.Scanner;

public class Main {
	int n;
	int max;
	int array[];
	int amount[];
	int sorted[];
	static final int MAX_INT = 10000;
	public static void main(String args[]) {
		new Main().run();
	}
	Main() {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		array = new int[n];
		amount = new int[MAX_INT + 1];
		sorted = new int[n];
		max = 0;
		for (int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
			amount[array[i]]++;
			max = Math.max(max, array[i]);
		}
	}
	void run() {
		for (int i = 0;i < max + 1; i++) {
			for(int j = 0; j < amount[i]; j++) {
				System.out.print((i==0?"":" ") + i);
			}
		}
	}
}

