import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Y = sc.nextInt();
		int M = 0;
		int G = 0;
		int S = 0;
		int chek = 0;

		loop: for(int i = 0; i <= N; i++) {
			if(i == 0 && N * 10000 == Y) {
				M = N;
				chek = 1;
				break loop ;
			}
			if(i == 0 && N * 5000 == Y) {
				G = N;
				chek = 1;
				break loop ;
			}
			if(i == 0 && N * 1000 == Y) {
				S = N;
				chek = 1;
				break loop ;
			}
			if(Y >= i * 10000 && Y <= N * 10000) {
				M = i;
			}
			for(int j = 0; j <= N - M; j++) {
				G = j;
				if(M + G == N && M * 10000 + G * 5000 == Y) {
					chek = 1;
					break loop;
				}
				if((Y - (M * 10000 + G * 5000)) / 1000 == N - M - G) {
					S = (Y - (M * 10000 + G * 5000)) / 1000;
					chek = 1;
					break loop;
				}
			}
			G = 0;
		}
		if(chek == 0) {
			M = -1;
			G = -1;
			S = -1;
		}
		System.out.print(M + " " + G + " " + S);
	}
}