import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String tapMoving = sc.next();
		
		for(int i = 0 ; i < tapMoving.length() ; i++ ) {
			char move = tapMoving.charAt(i);
			
			if (move == 'D' || move == 'U') {
				continue;
			}
			
			if ( i % 2 == 0 ) {
				if ( move == 'R' ) {
					//good move
				}
				else {
					System.out.println("No");
					return;
				}
			}
			
			if ( i % 2 == 1 ) {


				if ( move == 'L' ) {
					//good move
				}
				else {
					System.out.println("No");
					return;
				}
			}
		}
		
		System.out.println("Yes");
	}
}
