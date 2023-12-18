import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		int[] X = new int[M];
		for(int i=0; i<M; i++){
			X[i] = Integer.parseInt(sc.next());
		}
		Arrays.sort(X);
		int[] diff = new int[M-1];
		for(int i=0; i<M-1; i++){
			diff[i] = X[i+1] - X[i];
		}
		Arrays.sort(diff);
		if(N>=M){
			ans = 0;
		}else{
			for(int i=0; i<M-N; i++){
				ans += diff[i];
			}
		}
		System.out.println(ans);
		
	}
	
}
