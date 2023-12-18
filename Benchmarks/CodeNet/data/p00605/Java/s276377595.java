import java.io.*;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			while (!(buf = br.readLine()).equals("0 0")) {
				StringTokenizer st = new StringTokenizer(buf);
				int N = Integer.parseInt(st.nextToken());
				int K = Integer.parseInt(st.nextToken());
				st = new StringTokenizer(br.readLine());
				int type[] = new int[K];
				boolean able = true;
				for (int i=0;i<K;i++) {
					type[i] = Integer.parseInt(st.nextToken());
				}
				for (int i=0;i<N;i++) {
					st = new StringTokenizer(br.readLine());
					for (int j=0;j<K;j++) {
						type[j] -= Integer.parseInt(st.nextToken());
						if (type[j]<0) {
							able = false;
							break;
						}
					}
					if (!able) break;
				}
				if (able) System.out.println("Yes");
				else System.out.println("No");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}