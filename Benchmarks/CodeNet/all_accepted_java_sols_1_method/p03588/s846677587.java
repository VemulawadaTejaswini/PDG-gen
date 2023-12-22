import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		int minPoint = 0;
		int minRank = 0;
		for (int i = 0; i < N; i++) {
			int Ai = sc.nextInt();
			int Bi = sc.nextInt();
			sc.nextLine();
			if (i == 0 || Bi < minPoint) {
				minPoint = Bi;
				minRank = Ai;
			}
		}
		sc.close();
		
		System.out.println(minRank + minPoint);
	}
}