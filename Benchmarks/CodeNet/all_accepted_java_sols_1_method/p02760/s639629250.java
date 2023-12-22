import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int A[] = new int[9];
		int ans[] = new int[9];
		for(int i = 0; i < 9; i++){
			A[i] = stdIn.nextInt();
			ans[i] = 1;
		}
		int N = stdIn.nextInt();
		int B[] = new int[N];

		for(int i = 0; i < N; i++){
			B[i] = stdIn.nextInt();
			for(int j = 0; j < 9; j++){
				if(B[i] == A[j]){
					ans[j] = 0;
				}
			}
		}
		if(ans[0] == 0 && ans[3] == 0 && ans[6] == 0){
			System.out.println("Yes");
		}
		else if(ans[1] == 0 && ans[4] == 0 && ans[7] == 0){
			System.out.println("Yes");
		}
		else if(ans[2] == 0 && ans[5] == 0 && ans[8] == 0){
			System.out.println("Yes");
		}
		else if(ans[0] == 0 && ans[1] == 0 && ans[2] == 0){
			System.out.println("Yes");
		}
		else if(ans[3] == 0 && ans[4] == 0 && ans[5] == 0){
			System.out.println("Yes");
		}
		else if(ans[6] == 0 && ans[7] == 0 && ans[8] == 0){
			System.out.println("Yes");
		}
		else if(ans[0] == 0 && ans[4] == 0 && ans[8] == 0){
			System.out.println("Yes");
		}
		else if(ans[2] == 0 && ans[4] == 0 && ans[6] == 0){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
		stdIn.close();
	}
}