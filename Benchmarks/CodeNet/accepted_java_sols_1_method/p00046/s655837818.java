import static java.lang.System.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) throws Exception {
		ArrayList<Double> d = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;
		while (true) {
			buf = br.readLine();
			if (buf == null)
				break;
			d.add(Double.parseDouble(buf));
		}
		double max=d.stream().max((a,b)->a.compareTo(b)).get();
		double min=d.stream().min((a,b)->a.compareTo(b)).get();
		out.println(max-min);
	}
}