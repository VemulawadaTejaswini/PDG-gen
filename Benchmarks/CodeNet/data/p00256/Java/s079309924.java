import java.util.*;

public class Main {
	boolean isLeapYear(long y) {
		if(y%4==0) {
			if(y%100!=0 || y%400==0) {
				return true;
			}
		}
		
		return false;
	}
	
	long y2d(long y) {
		long day = 365;
		if( isLeapYear(y) ) {
				++day;
		}
		
		return day;
	}
	
	long ally2d(long y) {
		long day = 0;
		for( int i = 0; i < y; ++i ) {
			day += y2d(i);
		}
		
		return day;
	}
	
	long m2d(long y, long d) {
		switch((int)d){
		case 2:
			long day = 28;
			if( isLeapYear(y) ) {
				++day;
			}
			return day;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		default:
			return 31;
		}
	}
	
	long[] miniy = new long[]{ 2, 4, 6, 9, 11 };
	long allm2d(long y, long m) {
		long day = 0;
		for( int i = 1; i < m; ++i ) {
			day += m2d(y, i);
		}
		
		return day;
	}
	
	long cycle;
	long[] d4y;
	
	long[] max_may_n = new long[]{13, 20, 20, 19, 20};
	String usu2may(ArrayList<Integer> list) {
		long day = d4y[list.get(0)];
		day += allm2d(list.get(0), list.get(1));
		day += (long)list.get(2);
		
		day -= cycle;
		
		String ans = "";
		
		for( int i = 0; i < 5; ++i ) {
			if( i > 0 ) {
				ans += ".";
			}
			ans += (day / mayas_day[i])%max_may_n[i];
			day %= mayas_day[i];
		}
		
		return ans;
	}
	
	long ki = 1;
	long w  = 20*ki;
	long t  = 18*w;
	long ka = 20*t;
	long b  = 20*ka;
	long mayas_day[] = {b, ka, t, w, ki};
	String may2usu(ArrayList<Integer> list) {
		long day = 0;
		for( int i = 0; i < 5; ++i ) {
			day += mayas_day[i]*(long)list.get(i);
		}
		
		day += cycle;
		
		long y = 0;
		while(day > y2d(y)) {
			day -= y2d(y);
			++y;
		}
		long m = 1;
		while(day > m2d(y, m)) {
			day -= m2d(y, m);
			++m;
		}
		long d = day;
		
		return y + "." + m + "." + d;
	}
	
	void solve() {
		Scanner sc = new Scanner(System.in);
		
		cycle = 0;
		cycle += ally2d(2012);
		cycle += allm2d(2012, 12);
		cycle += 21;
		
		d4y = new long[10000001];
		d4y[0] = 0;
		for( int i = 1; i <= 10000000; ++i ) {
			d4y[i] = d4y[i-1] + y2d(i-1);
		}
		
		while(true) {
			String str = sc.nextLine();

			if( str.equals("#") ) {
				break;
			}
			
			ArrayList<Integer> list = new ArrayList<Integer>();
			for( String ite : str.split("\\.") ) {
				list.add(Integer.parseInt(ite));
			}
			
			System.out.println(list.size() == 3 ? usu2may(list) : may2usu(list));
		}
		
		sc.close();
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
	
	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}