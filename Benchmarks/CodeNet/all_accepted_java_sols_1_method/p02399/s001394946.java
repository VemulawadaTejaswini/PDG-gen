import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String inputData = reader.readLine();
			String[] strNumber = inputData.split(" ");
			int a = Integer.parseInt(strNumber[0]);
			int b = Integer.parseInt(strNumber[1]);
			BigDecimal bdA = new BigDecimal(a);
			BigDecimal bdB = new BigDecimal(b);

			int d = a / b;
			int r = a % b;
			BigDecimal bdDivide = bdA.divide(bdB , 8 , BigDecimal.ROUND_HALF_UP).setScale(8, BigDecimal.ROUND_FLOOR);

            System.out.println(d + " " + r + " " + bdDivide.toPlainString());

        } catch (IOException e) {
            e.printStackTrace();
        }


	}

}