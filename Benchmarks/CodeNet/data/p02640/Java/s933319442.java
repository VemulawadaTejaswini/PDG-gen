
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = Integer.parseInt(sc.next());
		int y = Integer.parseInt(sc.next());
		
		for(int i = 0 ; i <= 200 ; i++) {
			for(int j = 0 ; j <= 200 ; j++) {
				if((i+j) == x && (2*i + 4*j) == y) {
					System.out.println("Yes");
					return;
				}
			}
		}
		
		System.out.println("No");
		}

}
