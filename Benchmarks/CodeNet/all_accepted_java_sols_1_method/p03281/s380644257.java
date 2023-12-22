import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		sc.close();

		int count = 0;
		for(int i = 1; i <= N; i++) {
			int yaku = 0;
			if(i % 2 == 1) {
				for(int j = 1; j <= N; j++) {
					if(i % j == 0) {
						yaku++;
					}
				}
				if(yaku == 8) {
					count++;
				}
			}else {
				continue;
			}
		}
		System.out.println(count);
	}
}