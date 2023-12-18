import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String point[] = str.split(" ");
		double p[] = new double[4];

		for(int i=0; i<point.length; i++){
			p[i] = Double.parseDouble(point[i]);
		}

		double dis = Math.sqrt(Math.pow(p[2]-p[0], 2) + Math.pow(p[3]-p[1], 2));
		System.out.println((float)dis);

	}
}