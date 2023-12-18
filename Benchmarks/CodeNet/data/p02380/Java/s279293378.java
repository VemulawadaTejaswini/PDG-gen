import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input, " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int dig = Integer.parseInt(st.nextToken());
		double rad = Math.toRadians(dig);
		double pow_a = Math.pow(a, 2);
		double pow_b = Math.pow(b, 2);
		double pow_c = pow_a + pow_b - 2 * a * b * Math.cos(rad);
		double h = b * Math.sin(rad);
		double s = a * h / 2;
		double l = a + b + Math.sqrt(pow_c);

		System.out.printf("%.8f\n%.8f\n%.8f\n", s, l, h);

	}
}