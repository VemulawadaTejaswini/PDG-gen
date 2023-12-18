import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		List<Double> list = new ArrayList<Double>();
		for (int i = 0; i < N; i++) {
			list.add(Double.parseDouble(sc.next()));
		}

		double ans = list.stream().mapToDouble(s -> 1.0 / s).sum();

		ans = 1.0 / ans;
		
		System.out.println(ans);
		
	}

}
