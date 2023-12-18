import java.util.Calendar;
import java.util.Scanner;

public class Main {
	public static void main( String[] args ){
		Scanner sc = new Scanner( System.in );
		Calendar c1 =  Calendar.getInstance();
		Calendar c2 =  Calendar.getInstance();
		//y1 m1 d1 y2 m2 d2
		while( true ){
			int y1 = sc.nextInt();
			int m1 = sc.nextInt();
			int d1 = sc.nextInt();
			int y2 = sc.nextInt();
			int m2 = sc.nextInt();
			int d2 = sc.nextInt();
			if( y1 == -1 && m1 == -1 && d1 == -1 && y2 == -1 && m2 == -1 && d2 == -1){ break; }
			c1.set( y1, m1, d1);
			c2.set( y2, m2, d2);
			long msec = c2.getTimeInMillis() - c1.getTimeInMillis();
			System.out.println( msec / (1000 * 60 * 60 * 24) );
		}

	}
}