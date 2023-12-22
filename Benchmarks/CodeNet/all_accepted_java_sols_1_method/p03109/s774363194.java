import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int yyyy = Integer.parseInt(s.substring(0, 4));
		int mm = Integer.parseInt(s.substring(5, 7));
		int dd = Integer.parseInt(s.substring(8, 10));
		if (yyyy <= 2019 && mm <= 4) {
			if (mm == 4 && dd > 30) {
				System.out.println("TBD");
			} else {
				System.out.println("Heisei");
			}
			
			return;
		}
		
		System.out.println("TBD");
	}
}
