
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		BigDecimal[] a = new BigDecimal[3];
		BigDecimal[] b = new BigDecimal[3];
		BigDecimal[] c = new BigDecimal[3];
		BigDecimal[] ans = new BigDecimal[2];
		while(true){
			for(int i = 0; i < 3; i++)
				a[i] = BigDecimal.valueOf(cin.nextDouble());
			for(int i = 0; i < 3; i++)
				b[i] = BigDecimal.valueOf(cin.nextDouble());
			for(int i = 0; i < 3; i++)
				a[2-i] = a[2-i].divide(a[0],3,BigDecimal.ROUND_HALF_UP);
			for(int i = 0; i < 3; i++)
				b[2-i] = b[2-i].divide(b[0],3,BigDecimal.ROUND_HALF_UP);
			for(int i = 0; i < 3; i++)
				c[i] = a[i].subtract(b[i]);
			ans[1] = c[2].divide(c[1],3,BigDecimal.ROUND_HALF_UP);
			ans[0] = a[2].subtract(a[1].multiply(ans[1]));
			ans[0] = ans[0].divide(a[0],3,BigDecimal.ROUND_HALF_UP);
			System.out.println(ans[0]+" "+ans[1]);
		}
	}
}