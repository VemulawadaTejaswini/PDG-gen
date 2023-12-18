import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;


class Main throws IOException {
    public static void main(String[] a){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine();
		while (line != null) {

			String numArray[] = line.split(" ");

			double a = Double.valueOf(numArray[0]);
			double b = Double.valueOf(numArray[1]);
			double c = Double.valueOf(numArray[2]);
			double d = Double.valueOf(numArray[3]);
			double e = Double.valueOf(numArray[4]);
			double f = Double.valueOf(numArray[5]);

			double x = (b * f - c * e) / (d * b - a * e);
			double y = (c - a * x) / b;

			BigDecimal xBD = new BigDecimal(x);
			BigDecimal yBD = new BigDecimal(y);

			BigDecimal xROUND = xBD.setScale(3, BigDecimal.ROUND_HALF_UP);
			BigDecimal yROUND = yBD.setScale(3, BigDecimal.ROUND_HALF_UP);

			System.out.print(xROUND);
			System.out.print(" ");
			System.out.println(yROUND);

			line = br.readLine();
		}

    }
}