import java.io.*;
import java.lang.Math;

class Main{

	public static void main(String args[]) throws IOException{
		double input;
		String str;
		BufferedReader br;
		
		br = new BufferedReader(new InputStreamReader(System.in));

		str = br.readLine();

		input = Double.parseDouble(str);
		
		double a1 = input*input*Math.PI;
		double a2 = input*2.0*Math.PI;
		
		String answer1 = String.format("%.6f", a1);
		String answer2 = String.format("%.6f", a2);
		System.out.println(answer1 + " "+ answer2);

	}

}