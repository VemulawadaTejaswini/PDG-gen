import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double money = 100.00;
		for(int i=0; i<n; i++){
			money = money*1.05;
			BigDecimal tmp = new BigDecimal(money);
			money = tmp.setScale(0,BigDecimal.ROUND_UP).doubleValue();
		}
		System.out.println((int)money*1000);
	}
}