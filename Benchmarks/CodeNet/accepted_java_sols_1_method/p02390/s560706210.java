import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int total = Integer.parseInt(scan.next());
		scan.close();
		int hour = total / 3600;
		int min = (total - hour * 3600) / 60;
		int sec = (total - hour * 3600 - min * 60);
		System.out.println(hour + ":" + min + ":" + sec);
	}
}

