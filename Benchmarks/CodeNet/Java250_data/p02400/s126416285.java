import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) throws Exception {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		String str = br.readLine();

		BigDecimal r = new BigDecimal(str);
		BigDecimal pi = new BigDecimal(Math.PI);
		BigDecimal d = new BigDecimal("2");

		String area =r.multiply(r).multiply(pi).toPlainString();
		String circle =r.multiply(d).multiply(pi).toPlainString();

		System.out.println(area + " "+circle);
	}

	//?¬¬????????°???????????????????????????
	public static String SubStringStart(String str) {
		int index = str.indexOf(" ");
		return (str.substring(0, index));
	}

	//	?¬¬????????°???????????????????????????
	public static String SubStringEnd(String str) {
		int index = str.lastIndexOf(" ");
		return (str.substring(index + 1));
	}
}