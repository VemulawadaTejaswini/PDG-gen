import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long K = sc.nextLong();
		int[] A = new int[N];
		int[] B = new int[M];
		
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		for (int i = 0; i < M; i++) {
			B[i] = sc.nextInt();
		}
		
		
		//aから始まる場合
		long minute = 0;
		int countA = 0;
		int countB = 0;
		
		//事前準備
		for (int i = 0; i < N; i++) {
			if(minute + A[countA] > K) break;
			minute += (long)A[i];
			countA++;
		}
		
		//Bに置き換えていく
		long maxNumAStart = countA + countB;
		for (int i = countB; i < M; i++) {
			while(minute + B[countB] > K) {
				if(countA == 0) {
					break;
				}
				minute -= A[countA];
				countA--;
			}
			if(minute + B[countB] > K) {
				break;
			}
			minute += B[countB];
			countB++;
			if(countA + countB >= maxNumAStart) {
				maxNumAStart = countA + countB;
			}
			
		}
		
		System.out.println(maxNumAStart);
	}

}
