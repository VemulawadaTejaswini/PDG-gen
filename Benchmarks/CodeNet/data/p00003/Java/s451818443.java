import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dataSetOfNum = scan.nextInt();
		int side1, side2, side3;
		
		for(int i = 1; i <= dataSetOfNum; i++) {
			side1 = scan.nextInt();
			side2 = scan.nextInt();
			side3 = scan.nextInt();
			
			if((Math.pow(side1, 2) + Math.pow(side2, 2)) == Math.pow(side3, 2)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}