
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

//		//int n = Integer.parseInt(sl[0]);
//		//long k = Long.parseLong(sl[1]);
//
//		long v[] = new long[200];
//
//		s = r.readLine();
//		sl = s.split(" ");
//		for (int i = 0; i < n; i++) {
//			v[i] = Long.parseLong(sl[0]);
//		}

		System.out.println(s.substring(0, 3));
	}
}