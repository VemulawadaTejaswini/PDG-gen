import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int M = stdIn.nextInt();
		int L[] = new int[M];
		int R[] = new int[M];
		
		for(int i = 0; i < M; i++) {
			L[i] = stdIn.nextInt();
			R[i] = stdIn.nextInt();
		}
		int maxL = L[0];
		int minR = R[0];
		
		for(int i = 1; i < M; i++) {
			if(maxL < L[i]) {
				maxL = L[i];
			}
			if(minR > R[i]) {
				minR = R[i];
			}
		}
		
		if((minR - maxL) >= 0) {
			System.out.println(minR - maxL + 1);
		}
		else {
			System.out.println(0);
		}

	}

}