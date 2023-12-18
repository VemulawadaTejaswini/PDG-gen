import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		double r = Double.parseDouble(br.readLine());

		double circle = r * 2 * 3.14;
		double area = r * r * 3.14;

		System.out.printf("%.5f",area);
		System.out.printf(" " + "%.5f", circle);
	}
}