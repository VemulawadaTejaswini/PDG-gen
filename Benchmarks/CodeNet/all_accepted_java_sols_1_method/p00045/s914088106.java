import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int sum1=0;
		int sum2=0;
		int count=0;
		while(cin.hasNext()){
			count++;
			String str = cin.next();
			String s[] = str.split(",");
			sum1+=Integer.parseInt(s[0])*Integer.parseInt(s[1]);
			sum2+=Integer.parseInt(s[1]);
		}
		System.out.println(sum1);
		
		double ans = (double)sum2/(double)count;
		BigDecimal bi = new BigDecimal(String.valueOf(ans));
		System.out.println(bi.setScale(0,BigDecimal.ROUND_HALF_UP));
	}

}