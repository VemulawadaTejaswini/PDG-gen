import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
		int[][][] price = new int[A+1][B+1][C+1];

		int way = 0;

		for(int i=0; i<=A; i++) {
			for(int j=0; j<=B; j++) {
				for(int k=0; k<=C; k++) {
					price[i][j][k] = 500*i + 100*j + 50*k;
					if(price[i][j][k] == X) {
						way += 1;
					}
				}
			}
		}

		System.out.println(way);
	}

}
