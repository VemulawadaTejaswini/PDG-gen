import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			char[] str = sc.next().toCharArray();
			int[] data = new int[str.length];
			for (int i = 0; i < str.length; ++i) {
				data[i] = str[i] - 'a';
			}
			int[] as = new int[N];
			int[] bs = new int[N];
			for (int i = 0; i < N; ++i) {
				as[i] = sc.nextInt() - 1;
				bs[i] = sc.nextInt() - 1;
			}
			for (int i = N - 1; i >= 0; --i) {
				int a = as[i];
				int b = bs[i];
				int tmp = data[a];
				data[a] = data[b];
				data[b] = tmp;
				int dif = b - a;
				data[a] = (data[a] + dif) % 26;
				data[b] = (data[b] + dif) % 26;
			}
			for (int i = 0; i < str.length; ++i) {
				str[i] = (char) (data[i] + 'a');
			}
			System.out.println(String.valueOf(str));
		}
	}

}