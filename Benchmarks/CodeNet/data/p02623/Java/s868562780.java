import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		BigDecimal c = sc.nextBigDecimal();
		
		List<BigDecimal> d = new ArrayList<>();
		List<BigDecimal> e = new ArrayList<>();
 
		for (int i = 0; i < a; i++) {
			d.add(sc.nextBigDecimal());
		}
 
		for (int i = 0; i < b; i++) {
			e.add(sc.nextBigDecimal());
		}
		
		int n = 0;
		int m = 0;
		
		int saidaisu = 0;
		
		BigDecimal gokei = new BigDecimal("0");
		
		while (gokei.compareTo(c) <= 0) {
			if ((n < a && m < b && d.get(n).compareTo(e.get(m)) <= 0 && gokei.add(d.get(n)).compareTo(c) <= 0)
					|| (n < a && m >= b && gokei.add(d.get(n)).compareTo(c) <= 0)) {

				gokei = gokei.add(new BigDecimal(d[n]));
				n++;
				saidaisu++;
				
			} else if ((n < a && m < b && d.get(n).compareTo(e.get(m)) >= 0 && gokei.add(e.get(m)).compareTo(c) <= 0)
					|| (m < b && n >= a && gokei.add(e.get(m)).compareTo(c) <= 0)) {

				gokei = gokei.add(e.get(m));
				m++;
				saidaisu++;
				
			} else {

				break;

			}
		}
		System.out.println(saidaisu);
	}
}