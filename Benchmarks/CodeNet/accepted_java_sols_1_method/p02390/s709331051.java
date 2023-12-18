import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		int s = number.nextInt();
		int h = s / 3600;
		int m = (s % 3600) / 60;
		s = s - (h * 3600 + m * 60);
		System.out.println(h + ":" + m + ":" + s);
	}
}

