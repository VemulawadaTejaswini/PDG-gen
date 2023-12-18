import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}
	
	private void run() {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int weight = scan.nextInt();
			
			String[] str = {"1", "2", "4", "8", "16", "32", "64", "128", "256", "512", };
			
			int[] bit = new int[10];
			
			for (int i = 0; i < 10; i++) {
				bit[i] = weight % 2;
				weight /= 2;
			}
			
			StringBuffer out = new StringBuffer();
			for (int i = 0; i < 10; i++) {
				if (bit[i] == 1) out.append(str[i] + " ");
			}
			out.delete(out.length() - 1, out.length());
			System.out.println(out);
		}
	}
	
	private void debug() {
		System.out.println();
	}

}