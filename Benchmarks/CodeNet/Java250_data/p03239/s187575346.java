import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int T = sc.nextInt();

		int minC = 1001;
		for (int i=0; i<N; i++){
			int c = sc.nextInt();
			int t = sc.nextInt();
			if (minC > c && T >= t){
				minC = c;
			}
		}
		if (minC == 1001){
			System.out.println("TLE");
		} else {
			System.out.println(minC);
		}
	}
}