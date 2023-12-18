import java.io.*;

class Main {
	public static void main(String args[]) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
			double d[] = new double[3];
			String s = br.readLine();
			String[] a = s.split(" ");
			for(int i = 0;i < 3;i++)
				d[i] = Double.parseDouble(a[i]);
			double rad = d[2] * (Math.PI / 180);
			double h = d[1]*Math.sin(rad);
			double S = d[0]*h/2.0;
			double c = Math.sqrt(d[0]*d[0] + d[1]*d[1] - (2.0*d[0]*d[1]*Math.cos(rad)));
			double L = d[0] + d[1] + c;
			System.out.printf("%5.5f\n%5.5f\n%5.5f\n", S, L, h);
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}