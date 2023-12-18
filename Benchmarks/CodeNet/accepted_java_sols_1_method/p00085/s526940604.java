import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			while (!(buf = br.readLine()).equals("0 0")) {
				StringTokenizer st = new StringTokenizer(buf);
				int n = Integer.parseInt(st.nextToken());
				int m = Integer.parseInt(st.nextToken());
				ArrayList<Integer> a = new ArrayList<Integer>();
				for (int i=1;i<=n;i++) {
					a.add(i);
				}
				int p = (m-1)%n;
				while (a.size()>1) {
					a.remove(p);
					p = (p+m-1)%a.size();
				}
				System.out.println(a.get(0));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}