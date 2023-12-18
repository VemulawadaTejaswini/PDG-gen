import java.util.Scanner;

public class Main2 {
	int[][] arr = new int[10][10];
	
	void run() {
		Scanner scan = new Scanner(System.in);
		
		int n;
		n = scan.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 9; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		for(int i = 0; i < n; i++) {
			int ch;
			ch = check(arr[i]);
			if(ch == 1) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		
	}
	
	int check(int[] arr) {
		int box1 = 0, box2 = 0;
		
		for(int i = 0; i < 9; i++) {
			if(arr[i] > box1) {
				box1 = arr[i];
			} else if(arr[i] > box2) {
				box2 = arr[i];
			} else {
				return -1;
			}
		}
		
		return 1;
	}
	
	public static void main(String args[]) {
		new Main2().run();
	}
}

