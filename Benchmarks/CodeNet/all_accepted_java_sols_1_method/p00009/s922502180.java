import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while (stdIn.hasNext()) {
			int n = stdIn.nextInt();
			int h[] = new int[n + 1];
			int cou = 0;
			for (int i = 1; i < h.length; i++) 
				h[i] = 1;
			for (int a = 2; a < h.length; a++) {
				if (h[a] == 1) {
					for (int b = 1; b * a < h.length; b++)
						h[b * a] = 0;
					cou++;
				}
			}
			System.out.println(cou);
		}
	}
}