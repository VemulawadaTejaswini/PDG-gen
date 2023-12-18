
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	Scanner sc;

	void run() {

		boolean p[] = new boolean[1300000];
		Arrays.fill(p, true);
		p[0] = false;
		p[1] = false;

		for (int i = 0; i < 1300; i++) {
			if (p[i]) {
				for (int j = i + i; j < 1300000; j += i) {
					p[j] = false;
				}
			}
		}

		LinkedList<Integer> l = new LinkedList<Integer>();
		for (int i = 0; i < 1300000; i++) {
			if (p[i]) {
				l.add(i);
			}
		}

		for (;;) {
			int n = sc.nextInt();

			if (n == 0) {
				break;
			}

			int index = Collections.binarySearch(l, n);
			if(index >= 0){
				System.out.println(0);
			}else{
//				System.out.println(l.get(-index));
//				System.out.println(l.get(-index-1));
				System.out.println(l.get(-index-1) - l.get(-index-2));
			}
		}
	}

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
		new Main().run();
	}
}