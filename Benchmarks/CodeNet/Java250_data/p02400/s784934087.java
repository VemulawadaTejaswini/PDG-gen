import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {


        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String inputData = reader.readLine();

            BigDecimal r = new BigDecimal(inputData);
			BigDecimal bdPI = new BigDecimal(3.14159265358979323846d);

			BigDecimal area = r.pow(2).multiply(bdPI).setScale(6, BigDecimal.ROUND_HALF_UP);
			BigDecimal round = bdPI.multiply(r).multiply(new BigDecimal(2)).setScale(6, BigDecimal.ROUND_HALF_UP);

            System.out.println(area.toPlainString() + " " + round.toPlainString());

        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}