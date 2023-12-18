import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String datas = br.readLine();
		int r = Integer.parseInt(datas);
		
		double s = r * r * Math.PI;
		double l = 2 * r * Math.PI;
		
		System.out.printf("%.6f %.6f",s,l);
	}
}