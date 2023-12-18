import java.util.*;
import java.awt.geom.*;
import java.io.*;

public class Main{
	String [] table = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int s = sc.nextInt();
			int n = sc.nextInt();
			int t = sc.nextInt();
			String week = sc.next();
			String time = sc.next();
			int p = sc.nextInt();
			int m = sc.nextInt();
			if((s|n|t|p|m) == 0) break;
			
			double max = 0.0;
			for(int i = 0; i < 60 * 24 * 7; i++){
				double mP = 1;
				for(int j = 0 ; j < m; j++){
					int nowTime = i + j * t;
					if(isOK(nowTime, week, time) && isOK(nowTime + s , week, time)){
						mP *= pow(1.0 - 1.0 / p, n);
					}
				}
				max = Math.max(1.0 - mP, max);
			}
			System.out.printf("%.10f\n",max);
		}
	}

	private double pow(double nowP, int n) {
		double res = 1;
		for(int i = 0; i < n; i++){
			res *= nowP;
		}
		return res;
	}

	private boolean isOK(int nowTime, String weekStr, String timeStr) {
		int min = nowTime % 60;
		int hour = (nowTime % (60 * 24)) / 60;
		int week = (nowTime % (60 * 24 * 7)) / (60 * 24);
		if(! (weekStr.equals("All") || weekStr.equals(table[week]))) return false;
		if(timeStr.equals("All")) return true;
		else if(timeStr.charAt(0) == 'D'){
			if((6 <= hour && hour < 18) || (hour == 18 && min == 0)){
				return true;
			}
		}
		else{
			if((18 <= hour && hour <= 23) || (0 <= hour && hour <= 5) || (hour == 6 && min == 0)){
				return true;
			}
		}
		
		return false;
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}