import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;

		for(int i=1; i<=N; i++) {
			cnt = 0;
			for(int x=1; x<=i; x++) {
				for(int y=1; y<=i; y++) {
					for(int z=1; z<=i; z++) {
						if(x*x + y*y + z*z + x*y + y*z + z*x == i) {
							cnt += 1;
						}
					}
				}
			}
			System.out.println(cnt);
		}
		sc.close();
	}
}