import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main
{

	public static void main(String[] args) throws IOException
	{
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		double i = Double.parseDouble(str);
		String str2 = BigDecimal.valueOf(i * i * Math.PI).toPlainString();
		String str3 = BigDecimal.valueOf(2 * i * Math.PI).toPlainString();
		System.out.println(str2 + " " + str3);
	}

}

