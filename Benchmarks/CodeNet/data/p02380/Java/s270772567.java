import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input, " ");
		int side_a = Integer.parseInt(st.nextToken());
		int side_b = Integer.parseInt(st.nextToken());
		int dig_c = Integer.parseInt(st.nextToken());
		double rad_c = Math.toRadians(dig_c);
		double h = side_b * Math.sin(rad_c);
		double l = side_a + side_b + h;
		double s = (side_a * h) / 2;

		System.out.printf("%.8f\n%.8f\n%.8f", s, l, h);

	}
}