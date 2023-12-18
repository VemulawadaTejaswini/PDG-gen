import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] H = new int[N];
		for(int i=0; i<N; i++)
			H[i] = sc.nextInt();
		
		H[0]--;
		
		boolean ok = true;
		for(int i=0; i<N-1; i++) {
			if(H[i+1]<H[i]) {
				ok = false;
				break;
			} else if(H[i+1]>H[i]) {
				H[i+1]--;
			}
		}

		System.out.println(ok ? "Yes" : "No");
		sc.close();
	}
}