import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		String[] str = br.readLine().split(" ");
		int x1 = Integer.parseInt(str[0]);
		int x2 = Integer.parseInt(str[1]);
		int y1 = Integer.parseInt(str[2]);
		int y2 = Integer.parseInt(str[3]);
		double result = Math.sqrt(Math.pow((x1 + y1), 2));
		double result2 = Math.sqrt(Math.pow((x2 + y2), 2));
		double response = ((double)Math.sqrt(result + result2));
		BigDecimal bd = new BigDecimal(response);
		BigDecimal res = bd.setScale(8, BigDecimal.ROUND_HALF_UP);
		System.out.println(res.doubleValue());
	}
}