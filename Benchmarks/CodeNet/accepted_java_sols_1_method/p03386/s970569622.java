import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		sc.close();
		
		int count = B - A + 1;
		if(count <= 2 * K) {
			for(int i = A; i <= B; i++) {
				System.out.println(i);
			}
			return;
		}else {
			for(int i = A; i <= A + K - 1; i++) {
				System.out.println(i);
			}
			for(int i = B - K + 1; i <= B; i++) {
				System.out.println(i);
			}
			return;
		}
	}

}