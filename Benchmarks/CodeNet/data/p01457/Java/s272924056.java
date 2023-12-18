import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		int q = sc.nextInt();
		int num = 0;
		int lr = 0;
		for (int i = 0; i < q; i++) {
			sc.next();
			char p = sc.next().charAt(0);
			int n = sc.nextInt();
			if (p == '(') {
				if (num == 0) {
					num = n;
					lr = 1;
				} else {
					if (lr > 0) {
						num += n;
					} else {
						if (num >= n) {
							num -= n;
						} else {
							num = n - num;
							lr = 1;
						}
					}
				}
			} else {
				if (num == 0) {
					num = n;
					lr = -1;
				} else {
					if (lr < 0) {
						num += n;
					} else {
						if (num >= n) {
							num -= n;
						} else {
							num = n - num;
							lr = -1;
						}
					}
				}
			}
			if (num == 0)
				out.println("Yes");
			else 
				out.println("No");
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}