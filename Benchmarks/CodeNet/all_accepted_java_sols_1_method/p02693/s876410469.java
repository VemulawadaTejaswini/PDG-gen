import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = Integer.parseInt(sc.next());
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		sc.close();

		for(int i = A; i <= B ; i++) {
			if(i % K == 0) {
				System.out.println("OK");
				break;
			}

			if(i == B && i % K != 0) {
				System.out.println("NG");
			}
		}
	}

}