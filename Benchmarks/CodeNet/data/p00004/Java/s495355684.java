import java.io.*;
import java.math.BigDecimal;
//import java.lang.reflect.Array;
//import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String line = br.readLine();
			do {
				String[] in = line.split(" ", 0);
				//???????????????????¨????
				double x = ( Double.parseDouble(in[4]) * Double.parseDouble(in[2]) - Double.parseDouble(in[1]) * Double.parseDouble(in[5])) / ( Double.parseDouble(in[4]) * Integer.decode(in[0]) - Double.parseDouble(in[1]) * Double.parseDouble(in[3]) );
				double y = ( Double.parseDouble(in[3]) * Double.parseDouble(in[2]) - Double.parseDouble(in[0]) * Double.parseDouble(in[5])) / ( Double.parseDouble(in[3]) * Integer.decode(in[1]) - Double.parseDouble(in[0]) * Double.parseDouble(in[4]) );
				BigDecimal out1 = ( new BigDecimal(x) ).setScale(2, BigDecimal.ROUND_DOWN);
				BigDecimal out2 = ( new BigDecimal(y) ).setScale(2, BigDecimal.ROUND_DOWN);
				System.out.println(out1 + " " + out2);
				//???????????§??????
				line = br.readLine();
			} while (line != null);

		} catch (Exception e) {
			// TODO: handle exception
			System.exit(0);
		}

	}

}