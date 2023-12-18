import java.util.Scanner;

public class Main{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] x = new int[N];

		for(int i = 0; i < N; i++){
			x[i] = sc.nextInt();
		}

		for (int j = N - 1; j >= 0; j--){
			System.out.print(x[j]);
			if(j != 0){
				System.out.print(' ');
			}
		}
	}
}