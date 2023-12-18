import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();

		for(double a = -120; a < 120;a+=1) {
			for(double b = -120; b < 120;b+=1) {
				if((long)(Math.pow(a, 5) - Math.pow(b, 5)) ==x) {
					System.out.println((long)a + " " + (long)b);
					return;
				}
			}
		}
	}
}