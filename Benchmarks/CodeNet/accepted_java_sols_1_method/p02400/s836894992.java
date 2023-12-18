import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double r = Double.parseDouble(br.readLine());

		double circle_area = r * r * Math.PI;
		double circle_len = r * 2 * Math.PI;

		System.out.printf("%.6f %.6f", circle_area, circle_len);

	}
}