import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
 
 
		double ans = 0;
		Scanner scan = new Scanner(System.in);
		int minutes_length  = scan.nextInt();
		int hour_length  = scan.nextInt();
		double hour_time  = scan.nextInt();
		double minutes_time  = scan.nextInt();
 
 
 
		double minutes_pi = Math.PI/30*minutes_time;
		double hour_pi = Math.PI/6*(hour_time+ minutes_time/60);
		double theta = Math.PI/30*(5*(hour_time+ minutes_time/60)-minutes_time);
		ans = minutes_length*minutes_length+hour_length*hour_length-2*hour_length*minutes_length*Math.cos(theta);
 
 
		System.out.println( Math.sqrt(ans));
	}
 
}