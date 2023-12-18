import java.io.*;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			while (!(buf = br.readLine()).equals("-1")) {
				double q = Double.parseDouble(buf);
				
				double x = q/2;
				double A = Math.pow(x,3)-q;
				while (Math.abs(A)>=0.00001*q) {
					x -= A/(3*Math.pow(x,2));
					A = Math.pow(x,3)-q;
				}
				System.out.println(x);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}