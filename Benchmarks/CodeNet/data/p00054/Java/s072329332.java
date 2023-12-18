import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int ia = sc.nextInt();
			int ib = sc.nextInt();
			BigDecimal a = new BigDecimal(ia);
			BigDecimal b = new BigDecimal(ib);
			int n = sc.nextInt();
			BigDecimal big = a.divide(b,n+1,BigDecimal.ROUND_HALF_UP);
			String str = big.toString();
			String[] stra = str.split("\\.");
			if(stra.length < 9){
				str = stra[1] + "000000000";
			}
			str = str.substring(0,n);
			String[] strb = str.split("");
			int sum = 0 ;
			for(int i = 0; i < strb.length ; i++){
				sum += Integer.parseInt(strb[i]);
			}
			System.out.println(sum);
		}
		sc.close();
	}
}