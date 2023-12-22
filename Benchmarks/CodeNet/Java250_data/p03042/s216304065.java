import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try {
			String input = new BufferedReader(new InputStreamReader(System.in)).readLine();
			int pre = Integer.parseInt(input.substring(0, 2));
			int pro = Integer.parseInt(input.substring(2));
			boolean preIn12 = (0 < pre && pre <= 12);
			boolean proIn12 = (0 < pro && pro <= 12);

			String ret = (preIn12 && proIn12 ? "AMBIGUOUS"
								  : (proIn12 ? "YYMM"
								  : (preIn12 ? "MMYY"
								  : "NA")));
			System.out.println(ret);
		} catch (IOException e1) {
		}
	}
}
