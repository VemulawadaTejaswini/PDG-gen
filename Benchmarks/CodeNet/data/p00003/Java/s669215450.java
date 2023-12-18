import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dataSetOfNum = scan.nextInt();
		String[] results = new String[dataSetOfNum];
		int side1, side2, side3;
		
		for(int i = 0; i < results.length; i++) {
			side1 = scan.nextInt();
			side2 = scan.nextInt();
			side3 = scan.nextInt();
			
			if((Math.pow(side1, 2) + Math.pow(side2, 2)) == Math.pow(side3, 2)) {
				results[i] = "YES";
			} else {
				results[i] = "NO";
			}
		}
		
		for(int i = 0; i < results.length; i++) {
			System.out.println(results[i]);
		}
	}
}