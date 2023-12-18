import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int a = sc.nextInt();
		
		Main m = new Main();
		
		BigDecimal b = m.myPow( new BigDecimal(10),a);
		BigDecimal c = m.myPow( new BigDecimal(9),a);
		BigDecimal d = m.myPow( new BigDecimal(8),a);

		System.out.println(b.subtract(c).subtract(c).add(d).remainder(new BigDecimal(1000000007)));
	}

	private BigDecimal myPow(BigDecimal _x, int _n)
	{
		BigDecimal ret = new BigDecimal(1);
		while(_n > 0)
		{
			if(_n % 2 == 0)
			{
				_x = _x.multiply(_x);
				_n /= 2;
			}
			else
			{
				ret = ret.multiply(_x);
				_n -= 1;
			}
		}
		return ret;
	}
}