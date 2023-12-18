import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		long ans = 1;
		double []A = new double[N];
		for(int a = 0; a < N; a++){
			A[a] = stdIn.nextDouble();
		}
		for(int b = 0; b < N; b++){
			ans *= A[b];
		}
		if(ans > Math.pow(18, 10)){
			ans = -1;
		}
		System.out.println(ans);
		stdIn.close();
	}
}