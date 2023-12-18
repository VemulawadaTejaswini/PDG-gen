import java.util.ArrayList;

class Event
{
	int e;
	int a;
}

class Main
{
	public static void main(String [] args)
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);

		while( true )
		{
			int X, Y, Z;
			
			X = sc.nextInt();
			Y = sc.nextInt();
			Z = sc.nextInt();
			
			if ( X == Y && Y == Z && Z == 0 )
			{
				break;
			}
			
			Event ev[] = new Event[1+Y];
			double dp[][] = new double[1+Y][100*Y+1];
			int v[] = new int[X];
			
			for(int i = 0; i < X; ++i)
			{
				v[i] = sc.nextInt();
			}
			
			for( int i = 0; i < Z; ++i )
			{
				int n, e, a;
				n = sc.nextInt();
				e = sc.nextInt();
				a = sc.nextInt();
				ev[n] = new Event();
				ev[n].e = e;
				ev[n].a = a;
			}
			
			for(int i = 0; i <= Y; ++i)
			{
				for(int j = 0; j <= 100*Y; ++j)
				{
					dp[i][j] = Double.NEGATIVE_INFINITY;
				}
			}
			
			dp[0][0] = 1;
			for(int i = 0; i < Y; ++i)
			{
				for(int j = 0; j < 100*Y+1; ++j)
				{
					if( dp[i][j] == Double.NEGATIVE_INFINITY )
					{
						continue;
					}
				
					for(int k = 0; k < X; ++k) {
						int next = i+v[k];
						int nextProfit;
						
						int gain = 0;
						
						if( next >= Y ) {
							next = Y;
						}

						if( ev[next] != null ) {
							if( ev[next].e == 1 ) {
								next += ev[next].a;
							} else if( ev[next].e == 2 ) {
								gain = ev[next].a;
							} else if( ev[next].e == 3 ) {
								gain = -ev[next].a;
							}
						}

						if( next >= Y ) {
							next = Y;
						}
						
						nextProfit = j + gain;
						if( nextProfit < 0 ) nextProfit = 0;
						
						// System.out.println( next + " " + nextProfit + " " + i + " " + j );
						if( dp[next][nextProfit] == Double.NEGATIVE_INFINITY ) {
							dp[next][nextProfit] = 0;
						}
						dp[next][nextProfit] += dp[i][j] / X;
					}

					// double nextE = Math.max(0d, (dp[i]+gain)/X);

					// if( dp[next] == Double.NEGATIVE_INFINITY ) {
					// 	dp[next] = 0;
					//}
					// dp[next] += nextE / X;
					
					//dp[ next ] += nextE;
					// dp[next] += (dp[i] + gain) / X;
					// if( dp[next] < 0 ) dp[next] = 0;
				}
			}
			// System.out.println("----");
			for(int i = 0; i < dp.length; ++i){
				for(int j = 0; j < dp[i].length; ++j){
					if( dp[i][j] == Double.NEGATIVE_INFINITY ) {
						continue;
					}
					// System.out.println( i + " " + j + " "  + dp[i][j] );
				}
			}
			
			double res = 0;
			for(int j = 0; j < 100*Y+1; ++j){
				if( dp[Y][j] != Double.NEGATIVE_INFINITY ) {
					res += dp[Y][j] * j;
				}
			}
			
			System.out.println( (int)Math.floor(0.00000000001+res) );
		}
	}
}