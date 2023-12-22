import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= K; i++) {
			for (int j = 1; j <= K; j++) {
				for (int k = 1; k <= K; k++) {
					int tmp;
					int i1 = i;
					int j1 = j;
					int k1 = k;
					while ((tmp = k1 % j1) != 0) {
						k1 = j1;
						j1 = tmp;
					}
					while ((tmp = j1 % i1) != 0) {
						j1 = i1;
						i1 = tmp;
					}
					sum += i1;
 
				}
			}
		}
		System.out.println(sum);
 
	}
 
}