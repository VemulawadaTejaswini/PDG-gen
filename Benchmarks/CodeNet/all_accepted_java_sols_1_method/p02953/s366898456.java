import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] H = new int[N];
		boolean ok = true;
		for(int i = 0; i < N; i++)
			H[i] = sc.nextInt();
		for(int i = 1; i < N; i++) {
			if(H[i] > H[i-1])
				H[i]--;
			if(H[i] < H[i-1])
				ok = false;
		}
		System.out.println(ok ? "Yes" : "No");

	}

}
