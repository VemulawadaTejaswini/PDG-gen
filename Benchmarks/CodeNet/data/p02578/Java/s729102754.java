import java.util.Scanner;

public class Main {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		long result = 0;
		long nowHighestLength = 0;
		for (int i = 0; i < n; i++) {
			long numberILength = Long.parseLong(sc.next());
			if (nowHighestLength < numberILength) {
				nowHighestLength = numberILength;
			} else {
				result += nowHighestLength - numberILength;
			}
		}
		System.out.println(result);
		
		
	}	

}
