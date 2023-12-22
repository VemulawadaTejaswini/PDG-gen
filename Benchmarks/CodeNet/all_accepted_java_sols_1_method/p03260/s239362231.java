import java.util.*;

class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		int numA = scanner.nextInt();
		int numB = scanner.nextInt();
		
		if (numA >= 1 && numA <= 3 && numB >= 1 && numB <= 3) {
			//System.out.println("A = " + numA);
			//System.out.println("B = " + numB);
			
			int numAB = numA * numB;
			//System.out.println("A * B = " + numAB);
			
			if (numA == 2 || numB == 2) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}
		}
		
	}
}