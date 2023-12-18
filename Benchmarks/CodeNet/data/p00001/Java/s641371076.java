import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	
	void run() {
		Scanner scan = new Scanner(System.in);
		int[] inputArray = new int[10];
		int[] outputArray = new int[3];
		// input
		for(int i = 0; i < 10; i++) inputArray[i] = scan.nextInt();
		// search
		for (int i = 0; i < 3; i++) {
			int max = 0;
			int max_j = 0;
			for (int j = 0; j < 10; j++) {
				int tmp = inputArray[j];
				if(max < tmp) {
					max = tmp;
					max_j = j;
				}
			}
			outputArray[i] = max;
			inputArray[max_j] = 0;
		}
		// output
		for (int i = 0; i < 3; i++) {
			System.out.println(outputArray[i]);
		}
	}
}
