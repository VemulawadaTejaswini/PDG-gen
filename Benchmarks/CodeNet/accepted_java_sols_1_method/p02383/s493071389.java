import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		int dice[] = new int[6];
		int dice2[] = new int[6];
		String direction;
		
		for (int i = 0; i < 6; i++) {
			dice[i] = scan.nextInt();
			dice2[i] = dice[i];
		}
		
		direction = scan.next();
		
		for (int i = 0; i < direction.length(); i++) {
			switch(direction.charAt(i)) {
			case 'N':
				dice2[0] = dice[1];
				dice2[1] = dice[5];
				dice2[4] = dice[0];
				dice2[5] = dice[4];
				break;
			case 'E':
				dice2[0] = dice[3];
				dice2[2] = dice[0];
				dice2[3] = dice[5];
				dice2[5] = dice[2];
				break;
			case 'S':
				dice2[0] = dice[4];
				dice2[1] = dice[0];
				dice2[4] = dice[5];
				dice2[5] = dice[1];
				break;
			case 'W':
				dice2[0] = dice[2];
				dice2[2] = dice[5];
				dice2[3] = dice[0];
				dice2[5] = dice[3];
				break;
			default:
				break;
			}
			
			for( int j = 0; j < 6;j++) {
				dice[j] = dice2[j];
			}
		
		}
		
		scan.close();
		System.out.println(dice[0]);
	}
}
