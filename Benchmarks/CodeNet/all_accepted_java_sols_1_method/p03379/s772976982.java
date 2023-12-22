import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] X = new int[N+1];
		for(int i = 1 ; i <= N ; i++){
			X[i] = sc.nextInt();
		}
		sc.close();
		int[] Y = new int[N+1];
		for(int i = 1 ; i <= N ; i++){
			Y[i] = X[i];
		}

		Arrays.sort(Y);

		int a = Y[N/2];
		int b = Y[(N/2) + 1];

	//	System.out.println(a);
	//	System.out.println(b);

		for(int i = 1 ; i <= N ; i ++){
			//System.out.println("X[i] : "+X[i]);
			if(a != b){
				if(X[i] <= a){
					System.out.println(b);
				}
				if(X[i]>= b){
					System.out.println(a);
				}
			}
			else if(a == b){
				System.out.println(a);

			}
		}



	}

}