import java.util.Scanner;
public class Main {

	void doIt() {
		Scanner stdIn = new Scanner(System.in);

		while(true) {
			int n = stdIn.nextInt();
			if(n == 0) break;
			int[] data = new int[10];
			for(int r = 0; r < n; r++) {
				int input = stdIn.nextInt();
				data[input]++;
			}
			for(int r = 0; r < 10; r++) {
				if(data[r] != 0) {
					for(int c = 0; c < data[r]; c++) {
						System.out.print('*');
					}
					System.out.println();
				} else {
					System.out.println('-');
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().doIt();
	}

}