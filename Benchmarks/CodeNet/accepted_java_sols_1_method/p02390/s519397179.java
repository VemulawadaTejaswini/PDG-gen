import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int secs = sc.nextInt();
		
		int hours = 0;
		while(secs >= 3600) {
			hours +=1;
			secs -= 3600;
		}
		
		int mins = 0;
		while(secs >= 60) {
			mins +=1;
			secs -=60;
		}
		
		System.out.println(hours + ":" + mins + ":" + secs);
	}
}