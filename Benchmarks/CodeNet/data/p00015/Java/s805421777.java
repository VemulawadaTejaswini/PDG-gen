
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		StringBuilder builder = new StringBuilder();
		StringTokenizer tokenizer;

		double x = 0;
		double y = 0;
		double ang = 90;
		while (true) {
			String line = reader.readLine();
			if (line.equals("0,0"))
				break;
			tokenizer = new StringTokenizer(line, ",");
			double d = Double.parseDouble(tokenizer.nextToken());
			double red = Math.toRadians(ang);
			x += d * Math.cos(red);
			y += d * Math.sin(red);
			ang -= Double.parseDouble(tokenizer.nextToken()) ;

		}
		System.out.println((int) x);
		System.out.println((int) y);
	}

}