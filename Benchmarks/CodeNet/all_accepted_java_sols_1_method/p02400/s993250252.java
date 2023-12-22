import java.io.*;
import java.util.Arrays;
class Main{
	public static void main(String[] args) throws IOException {
		double n;
		String str;
		String[] f = new String[5];
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		str = in.readLine();
		n = Double.parseDouble(str);
		f[0] = String.format("%.6f",2*n*Math.PI);
		f[1] = String.format("%.6f",n*n*Math.PI);
		System.out.println(f[1]+" "+f[0]);
	}
}