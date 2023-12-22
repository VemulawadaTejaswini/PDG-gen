import java.util.*;

public class Main{
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		int N = 5, sum = 0, n = 10;
		int[] t = new int [N];
		for (int i = 0; i < N; i++){
			t[i] = s.nextInt();
			int[] T = {(int)Math.ceil(t[i] / 10.0), t[i] % 10};
			// System.out.println(T[0] + " " + T[1]);
			sum += T[0];
			// System.out.println(sum);
			if (T[1] < n && T[1] != 0) n = T[1];
			// System.out.println(n);
			// System.out.println();
		}
		System.out.println(sum * 10 + n - 10);
		/*
		29 20 7 35 120 ->215
		101 86 119 108 57 -> 481
		*/
		
	}
}
