import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void run() {
		int[] array = new int[3];
		Scanner scan = new Scanner(System.in);
		int tmp = scan.nextInt();
		while (tmp != 0) {
			tmp--;
			for (int i = 0; i < 3; i++) array[i] = scan.nextInt();
			// check
			boolean ch = false;
			for (int i = 0; i < 3; i++) {
				int j = (i+1) % 3;
				int k = (i+2) % 3;
				if(array[i]*array[i] + array[j]*array[j] == array[k]*array[k]) ch = true;
			}
			// output
			if(ch) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
