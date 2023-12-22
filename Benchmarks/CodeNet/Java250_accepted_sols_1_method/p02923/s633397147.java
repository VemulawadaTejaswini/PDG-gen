import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		
		int[] H = new int[N];
		int[] countH = new int[N];
		
		
		for(int i = 0 ; i < N ; i++) {
			H[i] = Integer.parseInt(sc.next());
		}
		
		for(int i = 0 ; i < N-1 ; i++) {
			if (H[i] >= H[i+1]) {
				countH[i] = 1;
			}
		}
		/*
		for(int i = 0 ; i < N ; i++) {
			System.out.print(countH[i] + " ");
		}
		System.out.println();
		*/
		int ans = 0;
		int count = 0;
		
		for(int i = 0 ; i < N ; i++) {
			if(countH[i] == 1) {
				count++;
			}else{
				if(count > ans) {
					ans = count;
				}
				count = 0;
			}
			// System.out.print(ans + " ");
		}
		System.out.println(ans);
	}

}
