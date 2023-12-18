import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

Class Main{
	public static void main(String args) throws IOException {
		BufferedReader br = new BufferdReader(new InputStreamReader(System.in));
		double r = Double.parseDouble(br.readLine());
		double pi = Math.PI;
		double x = r*r*pi;
		double y = 2*r*pi;
		System.out.printf("%.6f %.6f",x,y);
	}
}