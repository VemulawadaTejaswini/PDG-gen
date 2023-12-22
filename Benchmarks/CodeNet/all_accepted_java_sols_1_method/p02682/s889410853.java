import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		int C = stdIn.nextInt();
		int K = stdIn.nextInt();
		int ans = 0;
		for(int a = 0; a < K; a++){
			if(A > 0){
				A = A - 1;
				ans++;
			}
			else if(B > 0){
				B = B - 1;
			}
			else{
				C = C - 1;
				ans = ans - 1;
			}
		}
		System.out.println(ans);
		stdIn.close();
	}
}