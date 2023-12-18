
import java.util.Scanner;
import java.util.ArrayList; 

class Main
{
	static class Answer
	{
		public double x;
		public double y;
		Answer( double x_, double y_ )
		{
			x = x_; y = y_;
		}
	}
	public static void main(String[] av)
	{
		Scanner sc = new Scanner( System.in );
		ArrayList<Answer> al = new ArrayList<Answer>();		
		final int N = 6;
		while ( sc.hasNextDouble() )
		{
			double [] src = new double[N];
			for ( int i = 0; i < N; ++i )
			{
				src[i] = sc.nextDouble();
			}
			double divisor1 = src[0];
			double divisor2 = src[3];
			for ( int i = 0; i < 3; ++i )
			{
				src[i] /= divisor1;
				src[i+3] /= divisor2;
			}
			double ycoef1 = src[1] - src[4];
			double value1 = src[2] - src[5];
			double y = value1 / ycoef1;
			double x = src[2] - y * src[1];
			al.add( new Answer( x, y) );
		}
		for ( Answer ans : al )
		{
			java.math.BigDecimal bdx = new java.math.BigDecimal(ans.x);
			java.math.BigDecimal bdy = new java.math.BigDecimal(ans.y);
			java.math.BigDecimal x = bdx.setScale(4, java.math.BigDecimal.ROUND_HALF_UP ); 
			java.math.BigDecimal y = bdy.setScale(4, java.math.BigDecimal.ROUND_HALF_UP ); 
			System.out.printf("%.3f %.3f\n", x.doubleValue(), y.doubleValue());
		}
	}
}