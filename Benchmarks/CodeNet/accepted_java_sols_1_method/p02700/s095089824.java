import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int aHP = scan.nextInt(), aA = scan.nextInt(), bHP = scan.nextInt(), bA = scan.nextInt();
		
		int ashibou = 0, bshibou = 0;
		
		if(aHP % bA != 0) {
			ashibou = aHP / bA +1;
			
		}else {
			ashibou = aHP / bA;
			
		}
		
		if(bHP % aA != 0) {
			bshibou = bHP / aA +1;
			
		}else {
			bshibou = bHP / aA;
			
		}
		
				
		if(ashibou >= bshibou) {
			System.out.println("Yes");
			
		}else {
			System.out.println("No");
			
		}
		
	}
	
		
		
}
