import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
 		Scanner scanner = new Scanner(System.in);
 		int n = scanner.nextInt();
 		int R[] = new int[n];
 		int maxv = -2000000000;
 		for (int i = 0;i < n; i++) {
 			int x = scanner.nextInt();
 			R[i] = x;
 			//System.out.println(Number[i]);
 		}
 		int minv = R[0];
 		for (int j = 1; j < n; j++) {
 			if (maxv < R[j] - minv) {
 				maxv = R[j] - minv;
 			}
 			if (minv > R[j]) {
 				minv = R[j];
 			}
 			//System.out.println(maxv);
 		}
 		System.out.println(maxv);
 	}
}

