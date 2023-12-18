import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = Integer.parseInt(in.next());
		int hour = s / 60 / 60;
		int minuit = s / 60 % 60;
		int second = s - hour * 60 * 60 - minuit * 60;
		
		System.out.println(hour + ":" + minuit + ":" + second);
	}
}	
