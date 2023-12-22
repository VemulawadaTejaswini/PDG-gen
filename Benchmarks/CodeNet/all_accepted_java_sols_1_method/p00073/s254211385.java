import java.io.*;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String b1,b2;

		try {
			while (true) {
				b1 = br.readLine();
				b2 = br.readLine();
				if (b1.equals("0")&&b2.equals("0")) break;
				double x = Double.parseDouble(b1);
				double h = Double.parseDouble(b2);
				double S = Math.pow(x,2)+(2*x*Math.sqrt(Math.pow(h,2)+Math.pow((x/2),2)));
				System.out.println(S);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}