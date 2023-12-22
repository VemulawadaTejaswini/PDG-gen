import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);

		int gameCount = stdin.nextInt();
		
		for(int i = 0; i < gameCount; i++) {
			
			int k = stdin.nextInt();
			int p = stdin.nextInt();
			int amari = k % p;
			if(amari == 0){ 
			System.out.println(p);
			} else {
				System.out.println(amari);
			}
		}
	}
}