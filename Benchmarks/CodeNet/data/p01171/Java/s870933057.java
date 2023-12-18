
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	Scanner sc;

	void run() {

		boolean[] p = new boolean[100000];

		Arrays.fill(p, true);
		p[0] = false;
		p[1] = false;

		for (int i = 0; i * i < 100000; i++) {
			if (p[i]) {
				for (int j = i + i; j < 100000; j += i) {
					p[j] = false;
				}
			}
		}

		int c = 0;
		for (int i = 0; i < 100000; i++) {
			if (p[i]) {
				c++;
			}
		}
		int pt[] = new int[c];

		int ind = 0;
		for (int i = 0; i < 100000; i++) {
			if (p[i]) {
				pt[ind] = i;
				ind++;
			}
		}

		for (;;) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			if ((a | b) == 0) {
				break;
			}

			int ka = 0;
			{
				int key = 0;
				int sum = 0;
				for (int i = 0; i < c && pt[i] <= a; i++) {
					if (a % pt[i] == 0) {
						sum += pt[i];
						key = pt[i];
					}
				}
				ka = key + key - sum;
			}
//			System.out.println(ka);
			int kb = 0;
			{
				int key = 0;
				int sum = 0;
				for (int i = 0; i < c && pt[i] <= b; i++) {
					if (b % pt[i] == 0) {
						sum += pt[i];
						key = pt[i];
					}
					kb = key + key - sum;
				}

			}
//			System.out.println(ka+ " " +kb);
			System.out.println(ka > kb ? "a" : "b");
		}
	}

	/**
	 * @param args
	 */

	Main() {
		sc = new Scanner(System.in);
		try {
			sc = new Scanner(new File(""));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().run();
	}

}