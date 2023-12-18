import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] X = new int[N];
		for(int i=0; i<N;i++) {
			X[i]=sc.nextInt();
		}
		int[] Y = X.clone();
		Arrays.sort(Y);
		int k = Y[N/2-1];
		int g = Y[N/2];
		for(int i=0;i<N;i++) {
			if(X[i]<=k) {
				System.out.println(g);
			}else{
				System.out.println(k);
			}
		}
	}
}