import java.io.*;

public class Main {

	public static void main(String[] args) {
		double x=0, y=0;
		double angle = 90;
		String[] sepa = new String[2];
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			try {
				sepa = in.readLine().split(",");
			} catch (Exception e) {}
			if(sepa[0].equals("0") && sepa[1].equals("0")) break;
			x += Integer.parseInt(sepa[0]) * Math.cos(Math.toRadians(angle));
			y += Integer.parseInt(sepa[0]) * Math.sin(Math.toRadians(angle));
			angle -= Double.parseDouble(sepa[1]);
		}
		System.out.println((int)x);
		System.out.println((int)y);
	}

}