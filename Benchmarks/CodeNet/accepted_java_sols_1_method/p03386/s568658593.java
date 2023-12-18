import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int K = sc.nextInt();
		for (int i = A; i <= B; i++) {
			if (B-A-1>=K &&(i >= A && A + K > i) || (B >= i && i > B - K)) {
				System.out.println(i);
			}else if(K>B-A-1) {
				System.out.println(i);
			}
		}
	}
}