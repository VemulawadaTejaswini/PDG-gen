import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		double[] relese = new double[N];
		for(int i = 0; i<N; i++) {
			relese[i] = sc.nextDouble();
		}
		Arrays.sort(relese);
			double anser = relese[0];
			for(int i = 1 ; i<N;i++) {
				anser = (anser+relese[i])/2;
			}
			System.out.println(anser);

	}

}
