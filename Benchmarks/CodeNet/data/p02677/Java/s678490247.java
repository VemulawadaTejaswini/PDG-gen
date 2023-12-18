
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {


		double ans = 0;

		Scanner scan = new Scanner(System.in);
		int minutes_length  = scan.nextInt();

		int hour_length  = scan.nextInt();

		int hour_time  = scan.nextInt();

		int minutes_time  = scan.nextInt();



		double minutes_pi = Math.PI/30*minutes_time;
		double hour_pi = Math.PI/6*(hour_time+ minutes_time/60);

		ans = minutes_length*minutes_length+hour_length*hour_length-2*hour_length*minutes_length*Math.cos(hour_pi-minutes_pi);

		System.out.println( Math.sqrt(ans));
	}

}