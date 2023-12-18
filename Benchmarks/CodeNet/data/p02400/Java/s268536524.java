import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(is);
		double r = is.read();
		double p = Math.PI;

		System.out.printf("%f6n %f6\n",r*r+p,2*r*p);
	}

}