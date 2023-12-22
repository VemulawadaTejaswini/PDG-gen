import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];

		for(int i=0; i<n; i++) {
			x[i] = sc.nextInt();
		}

		for(int i=0; i<n; i++) {
			y[i] = sc.nextInt();
		}

		// マンハッタン距離
		double manhattan = 0;
		for(int i=0; i<n; i++) {
			manhattan += Math.abs(x[i] - y[i]);
		}


		// ユークリッド距離
		double euclid = 0;
		for(int i=0; i<n; i++) {
			euclid += Math.pow(x[i] - y[i], 2);
		}
		euclid = Math.sqrt(euclid);

		// チェビシェフ距離
		ArrayList<Double> distances = new ArrayList<>();
		for(int i=0; i<n; i++) {
			Double d = Math.abs(x[i] - y[i] - 0.0);
			distances.add(d);
		}
		Collections.sort(distances);
		Collections.reverse(distances);
		double chebyshev = distances.get(0);

		// 	ミンコフスキー距離
		double minkowski = 0;
		double p = 3.0;
		for(int i=0; i<n; i++) {
			minkowski += Math.pow(Math.abs(x[i] - y[i]), p);
		}
		minkowski = Math.pow(minkowski, 1/p);


		System.out.println(manhattan);
		System.out.println(euclid);
		System.out.println(minkowski);
		System.out.println(chebyshev);

		sc.close();

	}

}
