import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int sec = sc.nextInt();
			int hh = sec / 3600;
			int mm = sec % 3600 / 60;
			int ss = sec % 3600 % 60;
			System.out.println(hh + ":" + mm + ":" + ss);
		} finally {
			sc.close();
		}
	}
}