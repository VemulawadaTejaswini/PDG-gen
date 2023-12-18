import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A[] = new int[2];
		int B[] = new int[2];
		int C[] = new int[2];
		int D[] = new int[2];
		int E[] = new int[2];
		
		while(true){
			for(int i = 0; i < 2;i++){
				A[i] = sc.nextInt();
			}
			if(A[0] + A[1] == 0)break;
			for(int i = 0; i < 2;i++){
				B[i] = sc.nextInt();
			}
			if(B[0] + B[1] == 0)break;
			for(int i = 0; i < 2;i++){
				C[i] = sc.nextInt();
			}
			if(C[0] + C[1] == 0)break;
			for(int i = 0; i < 2;i++){
				D[i] = sc.nextInt();
			}
			if(D[0] + D[1] == 0)break;
			for(int i = 0; i < 2;i++){
				E[i] = sc.nextInt();
			}
			if(E[0] + E[1] == 0)break;
			
			int S[] = new int[5];
			
			S[0] = A[0] + A[1];
			S[1] = B[0] + B[1];
			S[2] = C[0] + C[1];
			S[3] = D[0] + D[1];
			S[4] = E[0] + E[1];
			
			int max = S[0];
			int idx = 0;
			
			for(int i = 1; i < 5;i++){
				if(max < S[i]){
					max = S[i];
					idx = i;
				}
			}
			
			
			if(idx == 0){
				System.out.println("A" + " " + max);
			}
			else if(idx == 1){
				System.out.println("B" + " " + max);
			}
			else if(idx == 2){
				System.out.println("C" + " " + max);
			}
			else if(idx == 3){
				System.out.println("D" + " " + max);
			}
			else if(idx == 4){
				System.out.println("E" + " " + max);
			}
			
			
			
		}
	}
}