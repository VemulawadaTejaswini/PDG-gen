
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] str = (br.readLine()).trim().split(" ");
		int[] arr = new int[n + 1];
		
		for (int i = 0; i < n + 1; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}

		long non = 0, p = 0;
		if (arr[0] == 0) {
			p = 1;
			non = 1;
		}

		for (int i = 1; i <= n; i++) {
			long cn = (long) Math.pow(2, p);
			p = cn - arr[i];
			non += cn;

		}
		System.out.println(non);

		return;
	}
}
