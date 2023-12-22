import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		for(int i = 0; i < x+1; i++) {
			if(2*i + 4*(x-i) == y) {
				System.out.println("Yes");
				break;
			}else if( i == x) {
				System.out.println("No");
			}
		}
	}
}