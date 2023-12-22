import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int THP = scanner.nextInt();
		int TAP = scanner.nextInt();
		int AHP = scanner.nextInt();
		int AAP = scanner.nextInt();
		
		scanner.close();
		
		int TC = AHP/TAP;
		int TCP = AHP%TAP;
		if (TCP != 0) {
			TC = TC + 1;
		}
		
		int AC = THP/AAP;
		int ACP = THP%AAP;
		
		if (ACP != 0) {
			AC = AC + 1;
		}
		
		if (TC == AC) {
			System.out.println("Yes");
		} else if (TC < AC) {
			System.out.println("Yes");
		} else if (TC + 1 == AC) {
			System.out.println("Yes"); 
		} else {
			System.out.println("No");
		}
	}

}
