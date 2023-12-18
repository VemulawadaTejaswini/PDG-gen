import java.util.Scanner;
	
	public class text {
	public static void main(String[] args){
		
		Scanner S = new Scanner(System.in);
		int N = S.nextInt();
		int M = S.nextInt();
		int[] A = new int[N];
		int[] A_num = new int[N];
		int[] B = new int[M];
		int a = 0;
		
		for(int i = 0;i < N;i++){
			A[i] = S.nextInt();
			}
		
		for(int i = 0;i < M;i++){
			B[i] = S.nextInt();
			}
		
		for(int j = 0;j < M;j++){
			int s = B[j];
			
			for(int i = 0;i < N;i++){
				if(s >= A[i]){
					A_num[i]++;
					break;
					}
				}
			}
		int max = A_num[0];
		for(int i = 0;i < N;i++){
			if(max <= A_num[i]){
				max = A_num[i];
				a = i + 1;
				}
			}
		System.out.print(a);
		}
	}