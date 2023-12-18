import java.util.Calendar;
import java.util.Scanner;

public class Main {
	public static void main( String[] args ){
		Scanner sc = new Scanner( System.in );
		Calendar c1 =  Calendar.getInstance();
		Calendar c2 =  Calendar.getInstance();
		int day;
		//y1 m1 d1 y2 m2 d2
		while( true ){
			int y1 = sc.nextInt();
			int m1 = sc.nextInt();
			int d1 = sc.nextInt();
			int y2 = sc.nextInt();
			int m2 = sc.nextInt();
			int d2 = sc.nextInt();
			if( y1 < 0 || m1 < 0 || d1 < 0 || y2 < 0 || m2 < 0 || d2 < 0){ break; }
			c1.set( y1, m1, d1);
			c2.set( y2, m2, d2);
			day = 0;
			while( !c1.equals(c2)){
				c1.add(Calendar.DAY_OF_MONTH, 1);
				day++;
			}
			System.out.println( day );
		}

	}
}