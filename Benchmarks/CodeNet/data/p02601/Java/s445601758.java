import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int K = scan.nextInt();

		for(int i=0; i<=K; i++) {
			for(int j=0; j<=K; j++) {
				for(int k=0; k<=K; k++) {
					int x = A * (2 ^ i);
					int y = B * (2 ^ j);
					int z = C * (2 ^ k);
					if(i+j+k == K && x<y && y<z) {
						System.out.println("Yes");
						return;
					}
				}
			}
		}
		System.out.println("No");
	}
}
