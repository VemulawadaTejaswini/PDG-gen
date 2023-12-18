import java.util.Scanner;
public class Main {

	public static void main(String[] args) {


		double ans = 0;
		System.out.println("キーボードから数字を入力してください");
		System.out.println("長針の長さ");
		Scanner scan = new Scanner(System.in);
		int minutes_length  = scan.nextInt();
		System.out.println("短針の長さ");
		int hour_length  = scan.nextInt();
		System.out.println("何時か");
		double hour_time  = scan.nextInt();
		System.out.println("何分か");
		double minutes_time  = scan.nextInt();



		double minutes_pi = Math.PI/30*minutes_time;
		double hour_pi = Math.PI/6*(hour_time+ minutes_time/60);

		ans = minutes_length*minutes_length+hour_length*hour_length-2*hour_length*minutes_length*Math.cos(hour_pi-minutes_pi);



		System.out.println( minutes_pi);
		//System.out.println( str);
		//System.out.println( nagasa);
		System.out.println("答えは"+ Math.sqrt(ans));
	}

}