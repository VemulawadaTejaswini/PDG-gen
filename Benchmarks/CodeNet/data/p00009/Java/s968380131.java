import java.io.*;

public class Main {

	private static int[] arr = new int[1000000];

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str;

		while (null != (str = in.readLine())) {// 入力の終わりまで
			doit(Integer.parseInt(str));
		}
	}

	private static void doit(int n) {
		for (int i = 2; i <= n; i++)
			arr[i] = 1;
		for (int i = 4; i <= n; i++)
			if (i % 2 == 0)
				arr[i] = 0;
		for (int i = 3; i <= n / i; i += 2) {
			for (int j = i + 1; j <= n; j++)
				if (j % i == 0)
					arr[j] = 0;
		}
		int count = 0;
		for (int i = 2; i <= n; i++)
			count += arr[i];
		System.out.println(count);
	}
}