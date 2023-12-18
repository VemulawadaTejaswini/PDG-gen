import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line1 = br.readLine();
		String[] work = line1.split(" ");
		int a = Integer.parseInt(work[0]);
		int b = Integer.parseInt(work[1]);
		int c = Integer.parseInt(work[2]);
		int k = Integer.parseInt(work[3]);
		System.out.println(Math.min(a, k) - Math.max(0, (k - a - b)));
	}
}
