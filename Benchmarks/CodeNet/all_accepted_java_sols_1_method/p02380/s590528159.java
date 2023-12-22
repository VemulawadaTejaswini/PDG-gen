import java.io.*;
class Main {
	public static void main(String...args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] zahyos = br.readLine().split(" ");
		double[] tri = new double[3];
		double a = Double.valueOf(zahyos[0]); 
		double b = Double.valueOf(zahyos[1]); 
		double c = Double.valueOf(zahyos[2]);
		double powC = Math.pow(a ,2) + Math.pow(b,2)  - 2 * a * b * Math.cos(Math.toRadians(c));
		double shahenn = Math.sqrt(powC);
		double S = a * b /2 * Math.sin(Math.toRadians(c));
		double L = a + b + shahenn;
		double h = S * 2 /a;
		System.out.println(S);
		System.out.println(L);
		System.out.println(h);
	}
}
