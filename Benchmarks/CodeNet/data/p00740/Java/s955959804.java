import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			int p = sc.nextInt();
			if (n == 0) {
				break;
			}
			int turn = 0;
			int[] pebbles = new int[n];
			int inBowl = p;
			int winner = -1;
			while(true) {
				if (inBowl > 0) {
					inBowl--;
					pebbles[turn]++;
					if (inBowl == 0 && pebbles[turn] == p) {
						winner = turn;
						break;
					}
				}else{
					inBowl += pebbles[turn];
					pebbles[turn] = 0;
				}
				turn = (turn + 1) % n;
			}
			System.out.println(winner);
		}
	}

}