import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] que = new int[N];
		int[] ans = new int[N];
		
		for (int i = 1 ; i <= N ; i++) {
			ans[sc.nextInt()-1] = i; 
		}
		
		for (int i = 0 ; i < N ; i++) {
			System.out.print(ans[i] + " ");
		}
	}

}
