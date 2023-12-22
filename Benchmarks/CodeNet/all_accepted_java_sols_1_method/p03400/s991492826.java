import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int count = sc.nextInt();
		for (int i=0;i<N;i++) {
			int temp = sc.nextInt();
			for (int j=1;j<=D;j+=temp) {
				count ++;
			}
		}
		System.out.println(count);
	}
}