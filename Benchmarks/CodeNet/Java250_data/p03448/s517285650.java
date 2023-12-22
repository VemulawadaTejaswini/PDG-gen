import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	int A = 0;
	int B = 0;
	int C = 0;
	int X = 0;
	int count = 0;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		A =sc.nextInt();
		B =sc.nextInt();
		C =sc.nextInt();
		X =sc.nextInt();
		for(int i = 0; i <= A; i++) {
			for(int j = 0; j <= B; j++) {
				for(int k = 0; k <= C; k++) {
					if(i * 500 + j * 100 + k * 50 == X) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
		sc.close();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}