import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int M = in.nextInt();
		int cardNums[] = new int[2 * M + 1];

		for ( int i = 1; i <= M; i++ ) {
			cardNums[i] = in.nextInt();
			cardNums[i + M] = in.nextInt();
		}

		int limR = N;
		int limL = 1;
		
		for ( int i = 1; i <= M; i++ ) {
			if ( limL < cardNums[i] ) {
				limL = cardNums[i];
			}
		}
		for ( int i = M + 1; i <= 2*M; i++ ) {
			if ( limR > cardNums[i] ) {
				limR = cardNums[i];
			}
		}
		
		if ( limL > limR ) {
			System.out.println(0);
		} else {
			System.out.println(limR - limL + 1);
		}
		
		in.close();
	}
}