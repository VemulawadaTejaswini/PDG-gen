import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		String str = args[0];
		int temp = Integer.parseInt(str);
		BigDecimal bd = new BigDecimal(temp);
		System.out.println(bd.pow(3));
	}

}