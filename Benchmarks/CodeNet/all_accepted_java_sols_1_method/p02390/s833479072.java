import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int second = scan.nextInt();
		if (second < 0 || second >= 86400) {
			System.out.println("Error!");
		} else {
			int hour = second/3600;
			int minute = (second - hour*3600)/60;
			System.out.println(hour + ":" + minute + ":" + (second - hour*3600 - minute*60));
		}
	}

}