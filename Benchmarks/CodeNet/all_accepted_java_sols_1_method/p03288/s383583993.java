import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n <1200) {
			System.out.println("ABC");
		}else if(n>=1200 && n < 2800) {
			System.out.println("ARC");
		}else if(n >= 2800) {
			System.out.println("AGC");
		}
	}
}
