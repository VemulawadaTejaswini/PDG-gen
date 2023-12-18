
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, w, sum ;
		int min ;
		int max ;
		while (true) {
			w = sc.nextInt();
			sum=0;
			n = sc.nextInt();
			sum += n;

				max = n;

				min = n;


			if(w==0)
				break;
			for (int i = 1; i < w; i++) {
				n = sc.nextInt();
				sum += n;
				if (n > max)
					max = n;
				else if (n < min)
					min = n;

			}
			System.out.println((sum - (max + min)) / (w - 2));
		}
		sc.close();
	}
}