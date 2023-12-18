import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		double r;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		r = Double.parseDouble(s);

		System.out.printf("%.6f %.6f\n",Math.PI*r*r,2*Math.PI*r);
	}

}