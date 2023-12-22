import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] x = new int[N];
		for(int i = 0; i < N; i++) 
			x[i] = sc.nextInt();
		int[] y = x.clone();
		Arrays.sort(y);
		for(int i = 0; i < N; i++) {
			if(x[i] <= y[N/2-1])
				System.out.println(y[N/2]);
			else
				System.out.println(y[N/2-1]);
		}
		
	}

}