import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
		String s;
		String sl[];

		s = r.readLine();
		sl = s.split(" ");

		long a = Long.parseLong(sl[0]);
		long v = Long.parseLong(sl[1]);

		s = r.readLine();
		sl = s.split(" ");

		long b = Long.parseLong(sl[0]);
		long w = Long.parseLong(sl[1]);
		
		s = r.readLine();
		sl = s.split(" ");

		long t = Long.parseLong(sl[0]);

		if(v < w) {
			System.out.println("NO");
			System.exit(0);
		}
		System.out.println(Math.abs(a - b) <= t * Math.abs(v - w) ? "YES" : "NO");
	}
}