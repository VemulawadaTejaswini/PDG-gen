import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] c1, c2;
		int f = 0;

		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = 0;
			c1 = new int[a];
			c2 = new int[b];
			int tmp;
			int s1 = 0, s2 = 0;
			f = 0;
			if (a == 0 && b == 0)
				return;

			for (int i = 0; i < a; i++) {
				c1[i] = sc.nextInt();
			}
			for (int i = 0; i < b; i++) {
				c2[i] = sc.nextInt();
			}

			for (int i = 0; i < a && f == 0; i++) {
				for (int j = 0; j < b && f == 0; j++) {
					tmp = c1[i];
					c1[i] = c2[j];
					c2[j] = tmp;

					for (int k = 0; k < a; k++)
						s1 += c1[k];
					for (int k = 0; k < b; k++)
						s2 += c2[k];
					if(s1 == s2) {
						System.out.println(c2[j] + " " + c1[i]);
						f = 1;
					}
					else {
						tmp = c1[i];
						c1[i] = c2[j];
						c2[j] = tmp;
					}
				}
			}
		}
	}
}
