import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int X = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0 ; i < N; i++) {
			A[i] = sc.nextInt();
		}
		int eatNum = 0;
		for(int i = 0; i < N; i++) {
			int tmp = A[i];
			for(int j = 1; j <= 100; j++) {
				if(j == 1) {
					eatNum++;
				} else if((j-1)*tmp+1 <= D) {
					eatNum++;
				} else {
					break;
				}
			}
		}
		System.out.println(X+eatNum);
	}
}