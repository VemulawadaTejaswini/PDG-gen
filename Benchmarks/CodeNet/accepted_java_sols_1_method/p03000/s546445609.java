import java.util.Scanner;

/**
 * 2019/06/16
 * AtCoder Beginner Contest 130
 * 
 * B - Bounding
 * 
 * @author rued97
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = sc.nextInt();
		int L[] = new int[N];
		for(int i = 0; i < N; i++) {
			L[i] = sc.nextInt();
		}
		
		int cnt = 1;
		int D[] = new int[N + 1];
		D[0] = 0;
		for(int i = 1; i < N + 1; i++) {
			D[i] = D[i - 1] + L[i - 1];
			if(D[i] <= X) {
				cnt++;
			} else {
				break;
			}
		}

		System.out.println(cnt);
	}
	
}
