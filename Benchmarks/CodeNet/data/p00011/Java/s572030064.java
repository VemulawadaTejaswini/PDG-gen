import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int w, n, l[][], num[];
		int i;
		int tmp;
		String str;
		String str1[];

		Scanner sc = new Scanner(System.in);

		w = sc.nextInt();
		n = sc.nextInt();

		num = new int[w];
		str1 = new String[2];

		for (i = 0; i < w; ++i) {
			num[i] = i + 1;
		}

		l = new int[n][2];

		for (i = 0; i < n; ++i) {
			str = sc.next();
			str1 = str.split(",");
			l[i][0] = Integer.parseInt(str1[0]) - 1;
			l[i][1] = Integer.parseInt(str1[1]) - 1;
			// swap
			tmp = num[l[i][0]];
			num[l[i][0]] = num[l[i][1]];
			num[l[i][1]] = tmp;
		}
		// show answer
		for (i = 0; i < w; ++i) {
			System.out.println(num[i]);
		}
		sc.close();
	}

}
