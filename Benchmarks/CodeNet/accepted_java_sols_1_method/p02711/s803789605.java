import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		scan.close();
		
		for(int i = 0; i < 3; i++) {
			if(n%10 == 7) {
				System.out.println("Yes");
				return;
			}else {
				n /= 10;
			}
		}
		
		System.out.println("No");
	}

}