import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		for (int i = 1; i <= n; i++) {
			String s = String.valueOf(i / 10);
			if (i % 3 == 0) System.out.print(" " + i);
			else if (i % 10 == 3)  System.out.print(" " + i);
			else if (s.substring(s.length()-1,s.length()).equals("3")) System.out.print(" " + i);
		}
		System.out.println();
	}
}