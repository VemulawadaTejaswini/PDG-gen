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
		long minAStart = 0;
		int countAAStart = 0;
		int countBAStart = 0;
		
		//事前準備
		for (int i = 0; i < N; i++) {
			if(minAStart + A[countAAStart] > K) break;
			minAStart += (long)A[i];
			countAAStart++;
		}
		
		if(countAAStart == N) {
			for (int j = 0; j < M; j++) {
				if(minAStart + B[countAAStart] > K) break;
				minAStart += (long)B[j];
				countBAStart++;
			}
		}
		
		//Bに置き換えていく
		long maxNumAStart = countAAStart + countBAStart;
		for (int i = countBAStart; i < M; i++) {
			while(minAStart + B[countBAStart] > K) {
				if(countAAStart == 0) {
					break;
				}
				minAStart -= A[countAAStart];
				countAAStart--;
			}
			if(minAStart + B[countBAStart] > K) {
				break;
			}
			minAStart += B[countBAStart];
			countBAStart++;
			if(countAAStart + countBAStart >= maxNumAStart) {
				maxNumAStart = countAAStart + countBAStart;
			}
			
		}
		
		//bから始まる場合
		long minBStart = 0;
		int countBBStart = 0;
		int countABStart = 0;
		
		//事前準備
		for (int i = 0; i < N; i++) {
			if(minBStart + B[countBBStart] > K) break;
			minBStart += (long)B[i];
			countBBStart++;
		}
		
		if(countBBStart == N) {
			for (int j = 0; j < N; j++) {
				if(minBStart + A[countABStart] > K) break;
				minBStart += (long)A[j];
				countABStart++;
			}
		}
		//Aに置き換えていく
		long maxNumBStart = countBBStart + countABStart;
		for (int i = countABStart; i < N; i++) {
			while(minBStart + A[countABStart] > K) {
				if(countBBStart == 0) {
					break;
				}
				minBStart -= B[countBBStart];
				countBBStart--;
			}
			if(minAStart + A[countABStart] > K) {
				break;
			}
			minBStart += A[countABStart];
			countABStart++;
			if(countABStart + countBBStart >= maxNumBStart) {
				maxNumBStart = countABStart + countBBStart;
			}
		}
		
		
		System.out.println(Math.max(maxNumAStart, maxNumBStart));
	}

}
