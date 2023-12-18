import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1;i<=n; i++) {
			if (i % 3 == 0) {
				System.out.print(" " + i);
			} else if (i % 10 == 3) {
				System.out.print(" " + i);
			} else {
				for (int k = i;k>=10;) {
					k /= 10;
					if (k % 10 == 3) {
						System.out.print(" " + i);
						break;
					}

				}
			}
		}
		System.out.println();
	}
}

