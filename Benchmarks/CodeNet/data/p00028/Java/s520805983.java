import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private int[] mode = new int[100];

	public static void main(String[] args) {
		new Main().run();
	}
	
	private void run() {
		Scanner scan = new Scanner(System.in);
		Arrays.fill(mode, 0);
		while (scan.hasNext()) {
			int a = scan.nextInt() - 1;
			mode[a]++;
		}
		for (int i = 0; i < 100; i++) {
			boolean flag = false;
			int max = mode[i];
			for (int j = 0; j < 100; j++) {
				if(max < mode[j]) flag = true;
			}
			if (!flag) System.out.println(i+1);
		}
	}
	
	private void debug() {
		System.out.println();
	}

}