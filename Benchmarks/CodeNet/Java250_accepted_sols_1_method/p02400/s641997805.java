import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{

		double r, area, circumference;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        r = Double.parseDouble(br.readLine());

        area = r * r *  Math.PI;
        circumference = 2 * r *  Math.PI;
        System.out.println(String.format("%.6f", area) + " " + String.format("%.6f", circumference));

	}

}