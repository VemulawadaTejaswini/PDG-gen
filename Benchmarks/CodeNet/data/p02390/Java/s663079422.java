import java.util.Scanner;

public class Main {

  public static String hms(int remaining_seconds) {
    int hours = (int) remaining_seconds / 3600;
    remaining_seconds -= (hours * 3600);
    int minutes = (int) remaining_seconds / 60;
    remaining_seconds -= (minutes * 60);
    return hours + ":" + minutes + ":" + remaining_seconds;
  }

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int seconds = s.nextInt();
		System.out.println(hms(seconds));
	}
}
