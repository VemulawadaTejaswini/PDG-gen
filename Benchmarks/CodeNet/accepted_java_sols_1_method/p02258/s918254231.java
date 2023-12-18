import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		long[] R = new long[N];
		for(int i = 0; i < N; i++){
			R[i] = scanner.nextLong();
		}
		long tmp = R[0];
		long max = Integer.MIN_VALUE;
		for(int i = 0; i < N-1; i++){
			if(tmp >= R[i]){
				tmp = R[i];
			}
			max = Math.max(R[i+1]-tmp, max);
		}
		System.out.println(max);
	}
}

