import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String o = null, tmp;
		for (int i=0; i<n; i++) {
			tmp = br.readLine();
			o = (o == null) ? tmp: 0 < o.compareTo(tmp) ? tmp : o;
		}
		System.out.println(o);
	}
}