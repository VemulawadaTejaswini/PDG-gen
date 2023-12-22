
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		//入力
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.next());
		boolean matrics[][] = new boolean[N][N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) matrics[i][j] = false;
		}
		for(int i=0; i<N; i++) {
			int index = Integer.parseInt(scanner.next())-1;
			int k = Integer.parseInt(scanner.next());
			for(int j=0; j<k; j++) {
				matrics[index][Integer.parseInt(scanner.next())-1] = true;
			}
		}
		scanner.close();

		//出力
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				String s = matrics[i][j]? "1": "0";
				System.out.print(s);
				if(j==N-1) break;
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}

