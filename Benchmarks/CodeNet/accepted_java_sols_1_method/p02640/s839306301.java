import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if( y < x*2 || x*4 < y) {
				System.out.println("No");
			}else if(y % 2 != 0) {
				System.out.println("No");
			}else {
				System.out.println("Yes");
			}
			


		}catch(Exception e) {
			e.printStackTrace();

		}

	}
}
