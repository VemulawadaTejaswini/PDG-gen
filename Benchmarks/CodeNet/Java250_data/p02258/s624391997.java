import java.util.Scanner;

public class Main {
	int[] min = new int[2];
	
	void run() {
		// 入力
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] array = new int[200000];
		for(int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
		}
		int max = -1000000000;	
		searchMinimun(array, n-1);
		for(int i = n-1; i > 0; i--) {
			if(min[1] == i) searchMinimun(array, i-1);
			int tmp = array[i] - min[0];
			if(tmp > max) max = tmp;
		}
		System.out.println(max);
	}
	
	void searchMinimun(int[] array, int n) {
		min[0] = array[0];
		min[1] = 0;
		for(int i = 1; i <= n; i++) {
			if(min[0] > array[i]) {
				min[0] = array[i];
				min[1] = i;
			}
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}
