import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int wa = a+b;
		int sa = a-b;
		int seki = a*b;
		
		if (wa > sa) {
			
			if (wa > seki) {
				System.out.println (wa);
			}else {
				System.out.println (seki);
			}
		}else{
			if (sa > seki) {
				System.out.println (sa);
			}else {
				System.out.println (seki);
			}
			
		}
		
	}
}
