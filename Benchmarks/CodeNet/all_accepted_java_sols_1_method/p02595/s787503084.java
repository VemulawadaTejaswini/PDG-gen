import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigDecimal d = BigDecimal.valueOf(sc.nextInt());

		BigDecimal[] x = new BigDecimal[n];
		BigDecimal[] y = new BigDecimal[n];
		for(int i = 0;i<n;i++) {
			x[i]=BigDecimal.valueOf(sc.nextInt());
			y[i]=BigDecimal.valueOf(sc.nextInt());
		}
		sc.close();

		int ans = 0;
		for(int i = 0;i<n;i++) {
			BigDecimal tmp = x[i].multiply(x[i]).add(y[i].multiply(y[i]));
			BigDecimal dd = d.multiply(d);
			if(dd.compareTo(tmp)==1||dd.compareTo(tmp)==0) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}