
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		while (true) {
			int n, w, sum = 0;
			int min = 10000;
			int max = -100;
			Scanner sc = new Scanner(System.in);
			w = sc.nextInt();
			if(w==0)
				break;
			for (int i = 0; i < w; i++) {
				n = sc.nextInt();
				sum += n;
				if (n > max)
					max = n;
				else if (n < min)
					min = n;

			}
			System.out.println((sum - (max + min)) / (w - 2));
		}
	}
}