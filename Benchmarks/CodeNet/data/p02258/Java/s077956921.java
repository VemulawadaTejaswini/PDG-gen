import java.util.Scanner;

public class Main {
	void run() {
		// 入力
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] array = new int[200000];
		for(int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
		}
		int max = -1000000000;
		for(int i = n-1; i > 0; i--) {
			for(int j = i-1; j >= 0; j--) {
				int tmp = array[i] - array[j];
				if(tmp > max) max = tmp;
			}
		}
		System.out.println(max);
	}
	public static void main(String[] args) {
		new Main().run();
	}
}

