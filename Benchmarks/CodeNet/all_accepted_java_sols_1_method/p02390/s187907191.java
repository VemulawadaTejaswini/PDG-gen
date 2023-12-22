import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();

		if(0<=time && time<=86400){
			int hours = time/3600;
			int minutes = (time/60)-hours*60;
			int seconds = (time%3600) - minutes*60;
			System.out.println(hours + ":" + minutes + ":" + seconds);
		}



		sc.close();
	}

}