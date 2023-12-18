import java.util.*;

public class Main1 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		out: while (true) {
			int[] x;
			x = new int[5];
			for (int i = 0; i < 5; i++) {
				x[i] = s.nextInt();
				if (x[0] == 0)
					break out;
			}

			boolean[] j = { false, false, false };

			for (int i = 0; i < 5; i++) {
				j[x[i] - 1] = true;
			}

			if (j[0] && j[1] && j[2])
				for (int i = 0; i < 5; i++) {
					System.out.println("3");
				}

			if (j[0] && !j[1] && !j[2])
				for (int i = 0; i < 5; i++) {
					System.out.println("3");
				}

			if (!j[0] && !j[1] && j[2])
				for (int i = 0; i < 5; i++) {
					System.out.println("3");
				}

			if (!j[0] && j[1] && !j[2])
				for (int i = 0; i < 5; i++) {
					System.out.println("3");
				}

			if (!j[0] && j[1] && j[2])
				for (int i = 0; i < 5; i++) {
					if (x[i] == 2)
						System.out.println("1");
					else
						System.out.println("2");
				}

			if (j[0] && !j[1] && j[2])
				for (int i = 0; i < 5; i++) {
					if (x[i] == 3)
						System.out.println("1");
					else
						System.out.println("2");
				}

			if (j[0] && j[1] && !j[2])
				for (int i = 0; i < 5; i++) {
					if (x[i] == 1)
						System.out.println("1");
					else
						System.out.println("2");
				}

		}
	}
}