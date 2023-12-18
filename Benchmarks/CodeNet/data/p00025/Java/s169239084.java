import java.util.Scanner;

public class Main {
	private int a[] = new int[4];
	private int b[] = new int[4];

	public static void main(String[] args) {
		new Main().run();
	}
	
	private void run() {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			for (int i = 0; i < 4; i++) a[i] = scan.nextInt();
			for (int i = 0; i < 4; i++) b[i] = scan.nextInt();
			
			int hit = 0, blow = 0;
			
			for (int i = 0; i < 4; i++) {
				if (a[i] == b[i]) hit++;
			}
			
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (i != j && a[i] == b[j]) {
						blow++;
					}
				}
			}
			System.out.println(hit + " " + blow);
		}
	}
	
	private void debug() {
		System.out.println();
	}

}