import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {

		Scanner scaner = new Scanner( System.in );

		int time = Integer.parseInt( scaner.next() );
		final int HOUR = 3600;
		final int MINUTE = 60;

		int hour ;
		int minute ;
		int second  ;
		int remain;

		hour   = time / HOUR;
		remain = time % HOUR;

		minute = remain / MINUTE;
		remain = remain % MINUTE;

		second = remain;

		System.out.println( hour + ":" + minute + ":" + second );

		scaner.close();

	}

}