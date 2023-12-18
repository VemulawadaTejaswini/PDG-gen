import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			//学生の数
			int n = sc.nextInt();

			if (n == 0) {
				break;
			}

			//点数表
			int p[] = new int[n];

			//合計
			double t = 0;
			//平均
			double a = 0;
			//標準偏差
			double v = 0;

			double std = 0;

		
				for (int i = 0; i < n; i++) {

					//点数p
					p[i] = sc.nextInt();
					t += p[i];

				}

				a = t / n;

				for (int i = 0; i < n; i++) {
					v += ((p[i] - a) * (p[i] - a));
				}

				std = Math.sqrt(v / n);

				System.out.println(std);
			}
			sc.close();
		}

	}

