import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int k = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(b-a+1 < k) 
			if(a%k > 0 &&  a%k <= b%k) {
				System.out.println("NG");
				return;
			}
		
		System.out.println("OK");
	}

}