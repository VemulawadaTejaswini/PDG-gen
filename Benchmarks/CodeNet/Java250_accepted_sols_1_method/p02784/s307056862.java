import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int H = stdIn.nextInt();
		int N = stdIn.nextInt();
		int A[] = new int[N];
		int sum = 0;
		for(int i = 0; i < N; i++){
			A[i] = stdIn.nextInt();
			sum = sum + A[i];
		}
		if(H - sum > 0){
			System.out.println("No");
		}
		else{
			System.out.println("Yes");
		}
		stdIn.close();
	}
}