import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		long K = sc.nextLong();

		int[] A = new int[N];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}

		int[] B = new int[M];
		for(int i=0; i<M; i++) {
			B[i] = sc.nextInt();
		}

		int ans = 0;
		long time = 0;
		int A_index = 0;
		int B_index = 0;
		for(int i=0; i<N+M; i++) {
			//両方ない
			if(A_index == N && B_index == M) {
				break;
			}

			//Aにもうない
			if(A_index == N) {
				if(time + B[B_index] <= K) {
					time += B[B_index];
					B_index++;
					ans++;
				}else {
					break;
				}
			}
			//Bにもうない
			else if(B_index == M) {
				if(time + A[A_index] <= K) {
					time += A[A_index];
					A_index++;
					ans++;
				}else {
					break;
				}
			}
			//それ以外
			else {
			if(A[A_index] < B[B_index]) {
				if(time + A[A_index] <= K) {
					time += A[A_index];
					A_index++;
					ans++;
				}else {
					break;
				}
			}else if(A[A_index] > B[B_index]) {
				if(time + B[B_index] <= K) {
					time += B[B_index];
					B_index++;
					ans++;
				}else {
					break;
				}
			}else {
				if(A_index == N-1 && B_index == M-1) {
					if(time + A[A_index] <= K) {
						time += A[A_index];
						A_index++;
						ans++;
					}else {
						break;
					}
				}else if(A_index == N-1) {
					if(A[A_index] < B[B_index+1]) {
						if(time + A[A_index] <= K) {
							time += A[A_index];
							A_index++;
							ans++;
						}else {
							break;
						}
					}else {
						if(time + B[B_index] <= K) {
							time += B[B_index];
							B_index++;
							ans++;
						}else {
							break;
						}
					}
				}else if(B_index == M-1) {
					if(B[B_index] < A[A_index+1]) {
						if(time + B[B_index] <= K) {
							time += B[B_index];
							B_index++;
							ans++;
						}else {
							break;
						}
					}else {
						if(time + A[A_index] <= K) {
							time += A[A_index];
							A_index++;
							ans++;
						}else {
							break;
						}
					}
				}else {
					if(A[A_index+1] < B[B_index+1]) {
						if(time + A[A_index] <= K) {
							time += A[A_index];
							A_index++;
							ans++;
						}else {
							break;
						}
					}else {
						if(time + B[B_index] <= K) {
							time += B[B_index];
							B_index++;
							ans++;
						}else {
							break;
						}
					}
				}
			}
			}
		}

		System.out.println(ans);
	}


}
