
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
			if ( x == 0 ) x = 0;
			if ( y == 0 ) y = 0;
			al.add( new Answer( x, y) );
		}
		for ( Answer ans : al )
		{
			System.out.printf("%.3f %.3f\n", ans.x, ans.y);
		}
	}
}