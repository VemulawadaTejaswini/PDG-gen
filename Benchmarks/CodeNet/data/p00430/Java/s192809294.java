import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int[] square;
		for(;;) {
			n = sc.nextInt();
			if(n == 0) {
				break;
			}
			square = new int[n];
			square[0] = n;
			System.out.println(n);
			while(square[0] > 1) {
				square[0] --;
				square[1] ++;
				for(int i=1; square[i]>1; i++) {
					System.out.print(square[0]);
					int idx = 1;
					while(idx < n && square[idx] != 0) {
						System.out.print(" " + square[idx]);
						idx ++;
					}
					System.out.println();
					square[i] --;
					square[i+1] ++;
				}
				System.out.print(square[0]);
				int idx = 1;
				while(idx < n && square[idx] != 0) {
					System.out.print(" " + square[idx]);
					idx ++;
				}
				System.out.println();
			}
		}
	}
}