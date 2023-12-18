import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		double n = Double.parseDouble(str);
		double x = 100000;
		double r = 0;

		for(int i=0; i<n; i++){
			x *= 1.05;
			r = x%1000;
			if(r != 0)
				x = x + 1000 - r;
		}



		System.out.println((int)x);

	}
}