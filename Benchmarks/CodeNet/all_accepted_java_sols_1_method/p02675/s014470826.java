

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		scan.close();
		
		n = n % 10;
		
		if(n == 3) {
			System.out.println("bon");
		}else if(n == 0 || n == 1 || n == 6 || n == 8) {
			System.out.println("pon");
		}else {
			System.out.println("hon");
		}
	}

}
