import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double N = Double.parseDouble(sc.next());
		ArrayList<Double> list = new ArrayList<>();
		for(int i = 0; i< N; i++) {
			list.add(Double.parseDouble(sc.next()));
		}
		sc.close();

		double sum = 0;
		for(int i = 0; i< N; i++) {
			sum += 1 / list.get(i);
		}
		double ans = 1 / sum;
		System.out.println(ans);
	}

}
