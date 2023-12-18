import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int hour = S/3600;
		S -= hour * 3600;
		int minutes = S/60;
		S -= minutes * 60;
		System.out.println(hour + ":" + minutes + ":" + S);
	}
}