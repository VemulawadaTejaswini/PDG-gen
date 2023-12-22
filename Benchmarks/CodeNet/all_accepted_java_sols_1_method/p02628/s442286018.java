import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int K = stdIn.nextInt();
		int []p = new int[N];
		int max = 0;
		for(int a = 0; a < N; a++){
			p[a] = stdIn.nextInt();
		}
		Arrays.sort(p);
		for(int c = 0; c < K; c++){
			max += p[c];
		}
		System.out.println(max);
		stdIn.close();
	}
}
