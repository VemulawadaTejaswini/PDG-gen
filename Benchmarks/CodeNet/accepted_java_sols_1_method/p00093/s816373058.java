import java.io.*;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;
		boolean flag = false;

		try {
			while (!(buf = br.readLine()).equals("0 0")) {
				if (flag) System.out.println("");
				StringTokenizer st = new StringTokenizer(buf);
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				boolean First = true;
				for (int i=a;i<=b;i++) {
					if (i%4==0) {
						if (i%100==0) {
							if (i%400==0) {
								if (First) First = false;
								System.out.println(i);
							}
						} else {
							if (First) First = false;
							System.out.println(i);
						}
					}
				}
				if (First) System.out.println("NA");
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}