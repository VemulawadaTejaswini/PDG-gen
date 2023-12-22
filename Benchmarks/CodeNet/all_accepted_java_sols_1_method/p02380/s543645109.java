import java.io.*;

class Main {
	public static void main(String[] arg)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] div = br.readLine().split(" ");
		int a = Integer.parseInt(div[0]);
		int b = Integer.parseInt(div[1]);
		double c = Math.toRadians(Integer.parseInt(div[2]));

		double S = a*b*Math.sin(c)/2;
		double L = a+b+Math.sqrt(a*a+b*b-2*a*b*Math.cos(c));
		double H = b*Math.sin(c);
		System.out.printf("%.8f\n%.8f\n%.8f\n",S,L,H);
	}
}