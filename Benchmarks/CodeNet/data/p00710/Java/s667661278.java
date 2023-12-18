import static java.lang.Math.*;
import static java.util.Arrays.*;

import java.util.*;
import java.io.*;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt(), k = sc.nextInt();
			if((n|k) == 0)break;
			LinkedList<Integer> cards = new LinkedList<Integer>();
			for(int i=1;i<=n;i++) cards.add(n-i+1);
			for(int i=0;i<k;i++) {
				int p = sc.nextInt(), c = sc.nextInt();
				for(int j=0;j<c;j++) cards.addFirst(cards.remove(p+c-2));
			}
			System.out.println(cards.get(0));
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}