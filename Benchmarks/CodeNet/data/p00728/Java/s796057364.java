
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, w, sum ;
		int min ;
		int max ;
		while (true) {
			w = sc.nextInt();
			sum=0;
			min = 10000;
			max = -100;
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