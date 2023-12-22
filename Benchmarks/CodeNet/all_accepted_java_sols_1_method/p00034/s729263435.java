import java.io.*;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			while ((buf = br.readLine())!=null) {
				double l[] = new double[10];
				double v[] = new double[2];
				StringTokenizer st = new StringTokenizer(buf,",");

				double sum = 0;
				for (int i=0;i<10;i++) {
					l[i] = Integer.parseInt(st.nextToken());
					sum += l[i];
				}
				for (int i=0;i<2;i++)
					v[i] = Integer.parseInt(st.nextToken());

				double h = sum/(v[0]+v[1]);
				double d = (v[0]*h);
				double counter = 0;
				for (int i=0;i<10;i++) {
					counter += l[i];
					if (counter>=d) {
						System.out.println(i+1);
						break;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}