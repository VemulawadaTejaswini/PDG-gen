import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	private Scanner scan;

	private void mainrun() {
		scan = new Scanner(System.in);

		call(scan.nextInt());

		scan.close();
	}

	private void call(int n) {
		int i = 1;
		boolean f;

		f = false;

		while(true) {
			int x = i;
			f = false;

			if(x % 3 == 0) {
				System.out.print(" " + i);
				f = true;
			}

			if(!f) {
				while(true) {
					if(x % 10 == 3) {
						System.out.print(" " + i);
						break;
					}
					x /= 10;

					if(x == 0) {
						break;
					}
				}
			}

			if(++i > n) {
				break;
			}
		}
		System.out.println();
	}
}
