import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int N = sc.nextInt();
		int[] A;
		A = new int[N];

		for(int i = 0; i < N; i++){
		 	A[i]= sc.nextInt();
		}

		int count = 0;
		int flag = 1;
		while(flag == 1){
			flag = 0;
			for(int j = N - 1; j > 0; j--){
				if(A[j] < A[j-1]){
					int temp = A[j];
					A[j] = A[j-1];
					A[j-1] = temp;
					flag = 1; 
					count ++;
				}
			}
		}
		for(int k = 0; k < N; k++){
			System.out.printf("%d",A[k]);
			if(k != N - 1){
				System.out.printf(" ");
			}	
		}
		System.out.printf("\n%d\n",count);

	}
}
