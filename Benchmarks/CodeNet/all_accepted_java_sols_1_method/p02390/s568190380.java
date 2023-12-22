import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args){
		int min = 0, hour = 0;
	//	int sec = Integer.parseInt(args[0]);
		int sec = scan.nextInt();
		if(sec >= 60*60){
			hour = sec / (60 *60);
		}
			sec = sec - hour*60*60;

		if(sec>=60){
			min = sec /60;
		}
		sec = sec - min * 60;
	//	int sec = sec % 60;
		System.out.println(hour + ":" + min +":" + sec);
	}
}

