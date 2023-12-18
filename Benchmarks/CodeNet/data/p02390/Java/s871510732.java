import java.util.Scanner;

class Main {

	private static final int MINUTE_SEC = 60;
	private static final int HOUR_MIN = 60;
	
	private static final String STR = ":";

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sec = Integer.parseInt(sc.nextLine());
		
		int hourSec = MINUTE_SEC * HOUR_MIN;
		
		int h = 0;
		int m = 0;
		int s = 0;

		while (sec >= hourSec) {
			sec -= hourSec;
			h++;
		}
		while (sec >= MINUTE_SEC) {
			sec -= MINUTE_SEC;
			m++;
		}
		s = sec;
		
		System.out.println(h + STR + m + STR + s);
	}

}

