import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		long ruisekiWA = 0;
		for(long l = 1; l < 1000000000; l++) {
			ruisekiWA += l;
			if(ruisekiWA >= x) {
				System.out.println(l);
				return;
			}
		}
	}
}
