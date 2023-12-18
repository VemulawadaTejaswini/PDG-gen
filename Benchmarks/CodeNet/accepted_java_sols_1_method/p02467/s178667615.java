import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		List<Integer> list = new LinkedList<Integer>();
		System.out.print(n+":");

		for (int i=2; i*i<=n; i++) {
			while (n%i == 0) {
				n /= i;
				list.add(i);
			}
		}

		if (n > 1)
			list.add(n);

		for (int i : list) {
			System.out.print(" "+i);
		}
		System.out.println();

		br.close();
	}
}