import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		double r;
		double p = Math.PI;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		r = Double.parseDouble(str);

		System.out.printf("%1.6f %1.6f",r*r*p,2*r*p);
	}

}