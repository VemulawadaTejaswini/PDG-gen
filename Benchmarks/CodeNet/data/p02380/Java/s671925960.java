import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] age)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();

		String[] input = br.readLine().split(" ");
		double a = Double.parseDouble(input[0]);
		double b = Double.parseDouble(input[1]);
		int C = Integer.parseInt(input[2]);

		double S = 0.5*a*b*(Math.sin(Math.toRadians(C)));
		double h = b*(Math.sin(Math.toRadians(C)));
		double L = a+b+(Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2)-(2*a*b*Math.cos(Math.toRadians(C)))));

		String Sans = String.format("%.6f", S);
		String hans = String.format("%.6f", h);
		String Lans = String.format("%.6f", L);

		sb.append(Sans).append("\n").append(Lans).append("\n").append(hans).append("\n");
		System.out.print(sb);
	}
}