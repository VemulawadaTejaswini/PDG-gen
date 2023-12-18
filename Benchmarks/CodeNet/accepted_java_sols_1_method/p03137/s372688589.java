import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X[] = new int[M];
		for (int i=0;i<M;i++) {
			X[i]= sc.nextInt();
		}
		if (N>=M){
			System.out.println(0);
			return;
		}
		Arrays.parallelSort(X);
		int space[] = new int[M-1];
		for (int i=1;i<M;i++) {
			space[i-1] = X[i]-X[i-1];
		}
		Arrays.parallelSort(space);
		int count =0;
		for (int i=0;i<M-N;i++) {
			count +=space[i];
		}
		System.out.println(count);
	}
}