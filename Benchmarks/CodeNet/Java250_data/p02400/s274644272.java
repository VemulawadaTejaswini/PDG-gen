import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		double r = Double.parseDouble(br.readLine());
		if((0 < r) && (r <= 10000)){
			double f = ((double)(r * r)*Math.PI);
			double d = ((double)(r * 2)*Math.PI);

			System.out.printf("%1.6f %1.6f",f , d);
		}
	}
}