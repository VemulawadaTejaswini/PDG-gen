import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
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
		
		Collections.sort(list);
		
		double ans = list.get(0);
		list.remove(0);
		
		for (double v : list) {
			ans = ans/2 + v/2;
		}

		PrintWriter out = new PrintWriter(System.out);
		out.println(ans);
		out.flush();

	}

}
