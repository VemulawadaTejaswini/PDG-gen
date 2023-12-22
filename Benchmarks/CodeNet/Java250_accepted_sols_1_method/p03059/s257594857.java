import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int T = sc.nextInt();

		int sumB = 0;
		int i = 1;
		while(true) {
			if(i*A < T + 0.5) {
				i++;
				sumB += B;
			}else {
				break;
			}
		}

		System.out.println(sumB);
		sc.close();
	}
}