import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] hikakuStr = line.split("[\\s]+");
		// TODO ?????????????????????????????????????????????
		int a = Integer.parseInt(hikakuStr[0]);
		int b = Integer.parseInt(hikakuStr[1]);

		int d = a / b;
		int r = a % b;
		double f = (double) a / b;

		System.out.println(d + " " + r + " " + String.format("%.8f", f));
	}

}