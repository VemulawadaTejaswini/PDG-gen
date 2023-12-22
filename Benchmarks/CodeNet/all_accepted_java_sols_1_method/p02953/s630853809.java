import java.util.*;

public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] X = new int[N];
		for(int i = 0; i < N; i++) {
			X[i] = sc.nextInt();
		}
		boolean flag = true;
		for(int i = N - 2 ; i >= 0; i--) {
			if(X[i] > X[i + 1]) {
				if(X[i] - X[i + 1] == 1)X[i]--;
				else{
					flag = false;
					break;
				}
			}
		}

		System.out.println((flag)?"Yes":"No");

	}
}