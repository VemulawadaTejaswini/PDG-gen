
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] A = new int[N];
		boolean finish = false;
		int count = 0;
		for(int i = 0; i < N; i++) {
			A[i] = scan.nextInt();
		}
		while(true) {
			for(int i = 0; i < N; i++) {
				if(A[i] % 2 == 0) {
					A[i] = A[i] / 2;
				} else {
					finish = true;
					break;
				}
			}
			if(finish) {
				break;
			} else {
				count++;
			}
		}
		System.out.println(count);
		scan.close();

	}

}
