import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	private Scanner scan;

	private void mainrun() {
		scan = new Scanner(System.in);

		int a,b;

		while(scan.hasNext()) {
			a = scan.nextInt();
			b = scan.nextInt();

			System.out.println(ketasujudge(a+b));
		}

		scan.close();

	}

	private int ketasujudge(int num) {
		int n = 1;

		while(num / 10 != 0) {
			n++;
			num /= 10;
		}

		return n;
	}
}
