import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan =new Scanner(System.in);
		long A=scan.nextLong();
		double B=scan.nextDouble();
		double seki=(A*(B*100))/100 ;
		BigDecimal kirisute = new BigDecimal(String.valueOf(seki));
		BigDecimal answer = kirisute.setScale(0, RoundingMode.DOWN);
 
		
		System.out.println(answer);
	}
}