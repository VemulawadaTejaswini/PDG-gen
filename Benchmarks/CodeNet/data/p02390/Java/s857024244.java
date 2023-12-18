import java.util.Scanner;

public class Main {
	private void calc(){
		Scanner scanner = new Scanner(System.in);
		int time =scanner.nextInt();
		if(0<time && time<86400){
			int hour=time/3600;
			int min =(time-(3600*hour))/60;
			int sec =time-(3600*hour+60*min);
			System.out.println(hour+":"+min+":"+sec);
		}
		
	}
	
	public static void main(String[] args) {
		Main cubic =new Main();
		cubic.calc();

	}
}