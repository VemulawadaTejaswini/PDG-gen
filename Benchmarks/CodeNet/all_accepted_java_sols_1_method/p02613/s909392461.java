import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int acCount = 0;
		int waCount = 0;
		int tleCount = 0;
		int reCount = 0;
		while (scanner.hasNext()) {
			String str = scanner.next();
			if (str.equals("AC")) {
				acCount++;
			} else if (str.equals("WA")) {
				waCount++;
			} else if (str.equals("TLE")) {
				tleCount++;
			} else if (str.equals("RE")) {
				reCount++;
			}
		}
		System.out.println("AC x " + acCount);
		System.out.println("WA x " + waCount);
		System.out.println("TLE x " + tleCount);
		System.out.println("RE x " + reCount);
	}
}
