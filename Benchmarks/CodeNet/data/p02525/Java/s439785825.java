import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (!br.readLine().equals("0")) {
			String[] in = br.readLine().split(" ");
			double[] ary = new double[in.length];
			for (int i=0; i<ary.length; i++) ary[i] = Double.parseDouble(in[i]);
			double sum = 0D;
			for (double num : ary) sum += num;
			double m = sum/ary.length;
			double a = 0D;
			for (int j=0; j<ary.length; j++) a += Math.pow(ary[j]-m, 2);
			System.out.printf("%.5f" + System.getProperty("line.separator"), Math.sqrt(a/ary.length));
		}
	}
}