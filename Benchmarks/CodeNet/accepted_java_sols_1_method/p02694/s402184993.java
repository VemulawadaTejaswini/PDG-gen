import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long x = sc.nextLong();
		Long y = 100L;
		Long year = 0L;

		while(y < x) {
			y = (long)(y * 1.01);
			year++;
		}

		System.out.println(year);

		sc.close();
	}
}