import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int X = in.nextInt();
		int Y = in.nextInt();
		
		if(X < Y) {
			if(Y % 2 == 0) {
				if (X * 4 > Y) {
					Y = Y - X * 2;
					if(Math.signum(Y) == -1.0) {
						System.out.println("No");
					}else if(Y % 4 == 0){
						System.out.println("Yes");
					}else if((Y + 2) % 4 == 0){
						System.out.println("Yes");
					}else {
						System.out.println("No");
					}
				}else {
					System.out.println("No");
					}
			}else {
				System.out.println("No");
			}
		}else {
			System.out.println("No");
		}
	}
}
