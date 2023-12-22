import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] N = {111, 222, 333, 444, 555, 666, 777, 888, 999};

		for(int i = 0;i < N.length; i++) {
			if(N[i] == n) {
				System.out.println(N[i]);
				break;
			} else if(N[0] > n) {
				System.out.println(N[0]);
				break;
			} else if(N[i] < n && n < N[i + 1]) {
				System.out.println(N[i + 1]);
				break;
			}
		}


	}
}