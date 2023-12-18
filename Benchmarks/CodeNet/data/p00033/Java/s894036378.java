import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int N = sc.nextInt() ; N > 0; N--) {
			int[] data = new int[10];
			Tube t1 = new Tube();
			Tube t2 = new Tube();
			boolean flag = true;

			for (int i=0; i < 10; i++) {
				data[i] = sc.nextInt();
				if (data[i] > t1.look()) {
					t1.dropBall(data[i]);
				} else if (data[i] > t2.look()) {
					t2.dropBall(data[i]);
				} else {
					flag = false;
				}
			}

			if (flag) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

	public static class Tube {
		int[] tube;

		int pointer;

		public Tube() {
			tube = new int[11];
			tube[0] = -1;
			pointer = 0;
		}

		public int look() {
			return tube[pointer];
		}

		public void dropBall(int b) {
			pointer++;
			tube[pointer] = b;
		}
	}
}