import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		Scanner stdin = new Scanner(System.in);

		int dataset = 10;
		double[] w = new double[50];

		for(int i = 0; i < dataset; i++) {

			w[i] = stdin.nextDouble();

		}

		for(int i = 0; i < dataset; i++) {

			if(w[i] <= 48.0 ) {

				System.out.println("light fly");

			} else if(w[i] > 48.0  && w[i] <= 51.0) {
				System.out.println("fly");
			}else if(w[i] > 51.0  && w[i] <= 54.0) {
				System.out.println("bantam");
			}else if(w[i] > 54.0  && w[i] <= 57.0) {
				System.out.println("feather");
			}else if(w[i] > 57.0  && w[i] <= 60.0) {
				System.out.println("light");
			}else if(w[i] > 60.0  && w[i] <= 64.0) {
				System.out.println("light welter");
			}else if(w[i] > 64.0  && w[i] <= 69.0) {
				System.out.println("welter");
			}else if(w[i] > 69.0  && w[i] <= 75.0) {
				System.out.println("light middle");
			}else if(w[i] > 75.0  && w[i] <= 81.0) {
				System.out.println("middle");
			}else if(w[i] > 81.0  && w[i] <= 91.0) {
				System.out.println("ligth heavy");
			}else {
				System.out.println("heavy");
			}


		}

	}
}