import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int X = scan.nextInt();
		int []A = new int[M];
		for(int i = 0; i< M; i++) {
			A[i] = scan.nextInt();
		}
		scan.close();
		int index1 = X;
		int cost1 = 0;
		int cost2 = 0;
		for(int i = 0; i < X - 1; i++) {
			index1 --;
			for(int j = 0; j < M; j++) {
				if(index1 == A[j]) {
					cost1 ++;
				}
			}
		}
		cost2 = A.length - cost1;
		if(cost2 > cost1) {
			System.out.println(cost1);
		}else {
			System.out.println(cost2);
		}

	}
}