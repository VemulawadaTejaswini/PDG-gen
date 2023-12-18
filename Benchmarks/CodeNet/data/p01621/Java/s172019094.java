import java.lang.reflect.Array;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;


public class Main {
	static int S, N, T;
	static String WEEKDAY, TIME;
	static int P, M;
	
	static private void solve()
	{
		// Weekdayの数字化
		int Weekday = 0;
		     if(WEEKDAY.equals("All")) Weekday = -1;
		else if(WEEKDAY.equals("Sun")) Weekday = 0;
		else if(WEEKDAY.equals("Mon")) Weekday = 1;
		else if(WEEKDAY.equals("Tue")) Weekday = 2;
		else if(WEEKDAY.equals("Wed")) Weekday = 3;
		else if(WEEKDAY.equals("Thu")) Weekday = 4;
		else if(WEEKDAY.equals("Fri")) Weekday = 5;
		else if(WEEKDAY.equals("Sat")) Weekday = 6;
		
		     
		     
		     
		// 初期時間を決定する
		int week = 0;
		int time = 0;
		
		if(0 <= Weekday) week = Weekday;
		
		     if(TIME.equals("All")) time = 0;
		else if(TIME.equals("Day")) time = 6*60;
		else if(TIME.equals("Night")) 
		{
			if(Weekday < 0) time = 18*60;
			else {
				time = 0;
			}
		}
		
		
		
		
		
		
		// ステージ数分回す
		double ans = 0;
		double tmp = 1;
		for (int m = 0; m < M; m++) {
			boolean ok = false;
			for (int i = 0; i < T; i++) {
				if(0 <= i && i <= S)
				{
					if(Weekday == -1 || week == Weekday)
					{
						if (   TIME.equals("All")   ||
						     ( TIME.equals("Day")   && (6*60 <= time && time < 18*60) ) ||
						     ( TIME.equals("Night") && (18*60 <= time || time < 6*60) ) ) 
						{
							ok = true;
						}
					}
				}
				
				if(i == S)
				{
					if (ok) {
						for (int j = 0; j < N; j++) {
							ans += tmp / (double)P;
							tmp *= (double)(P-1) / (double)P;
						}
					}
				}
				
				time++;
				if(time == 24*60)
				{
					time = 0;
					week++;
					if(week == 7) week = 0;
				}
			}
		}
		
		
		
		
		if(ans > 1.0) ans = 1.0;
		
		System.out.printf("%.010f\n", ans);
	}
	
	static public void main(String[] args)
	{
		Scanner sca = new Scanner(System.in);
		
		while(true)
		{
			
			S = sca.nextInt();
			N = sca.nextInt();
			T = sca.nextInt();
			WEEKDAY = sca.next();
			TIME = sca.next();
			P = sca.nextInt();
			M = sca.nextInt();
			
			if(S == 0) break;
			
			solve();
		}
	}
}