import java.io.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		int n = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split("\\s+");
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) a[i] = Integer.parseInt(str[i]);
		
		int i = a.length;
		do {
			sb.append(a[i - 1]);
			i--;
			if ( i == 0) break;
			sb.append(" ");
		} while (true);
		
		System.out.println(sb);
	}
}