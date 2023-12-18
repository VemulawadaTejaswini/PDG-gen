//Volume5-0533
import java.util.Arrays;
import java.util.Scanner;

class Main {

	public static void main(String[] args){

		final int   N = 10;
		      int[] W = new int[N],
			        K = new int[N];

		Scanner sc = new Scanner(System.in);
		for(int i=0;i<N;i++){W[i] = sc.nextInt();}
		for(int i=0;i<N;i++){K[i] = sc.nextInt();}
		Arrays.sort(W);
		Arrays.sort(K);
		System.out.println((W[7]+W[8]+W[9])+" "+(K[7]+K[8]+K[9]));
	}
}