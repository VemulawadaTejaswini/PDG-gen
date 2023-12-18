import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {

		double tsubo = 3.305785;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try{
			String input = new String(in.readLine());
			int a = Integer.parseInt(input);

			String input2 = new String(in.readLine());
			int b = Integer.parseInt(input2);

			double s = (a * b) / tsubo;

			BigDecimal land = new BigDecimal(s);
			BigDecimal land1 = land.setScale(6,BigDecimal.ROUND_HALF_UP);

			System.out.println(land1);
		}catch(IOException e){
		}
	}

}