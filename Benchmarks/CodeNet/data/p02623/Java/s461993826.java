import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long K = sc.nextLong();
		int time = 0;
		int[] A = new int[N];
		int[] B = new int[M];
		int count = 0;
		int countA = 0;
		int countB = 0;
		for(int i = 0;i < N;i++){
			A[i] = sc.nextInt();
		}
		for(int i = 0;i < M;i++){
			B[i] = sc.nextInt();
		}
		while(time < K){
			if(countA < N && countB < M){
				if(A[countA] < B[countB]){
					time += A[countA];
					countA++;
				}else{
					time += B[countB];
					countB++;
				}
			}else if(countA == N && countB == M){
				break;
			}else if(countA == N){
				time += B[countB];
				countB++;
			}else{
				time += A[countA];
				countA++;
			}
			count++;
		}
		if(time > K){
			count--;
		}
		System.out.println(count);
	}
}