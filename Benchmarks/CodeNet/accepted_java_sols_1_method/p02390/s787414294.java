import java.util.Scanner;
import java.util.concurrent.*;

public class Main{
	public static void main(String[] args){
		long s,sec,min,hour;
		Scanner in = new Scanner(System.in);
		
		s = in.nextLong();
		
		hour = TimeUnit.SECONDS.toHours(s);
		min = TimeUnit.SECONDS.toMinutes(s) - hour*60;
		sec = TimeUnit.SECONDS.toSeconds(s) - hour*3600 - min*60;
		
		System.out.println(hour+":"+min+":"+sec);
	}
}