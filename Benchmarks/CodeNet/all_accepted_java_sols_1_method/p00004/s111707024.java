import java.io.*;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String buf;

		try {
			while ((buf = br.readLine())!=null) {
				StringTokenizer st = new StringTokenizer(buf);
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				int c = Integer.parseInt(st.nextToken());
				int d = Integer.parseInt(st.nextToken());
				int e = Integer.parseInt(st.nextToken());
				int f = Integer.parseInt(st.nextToken());
	
				double det1 = (double)a*e-b*d;
				double det2 = (double)c*e-b*f;
				double det3 = (double)a*f-c*d;
				if (det1 == 0.000) System.out.println("解なしor解がたくさん");
				else {
					String x = String.format("%.3f",(double)Math.round((det2/det1)*1000)/1000);
					String y = String.format("%.3f",(double)Math.round((det3/det1)*1000)/1000);
					System.out.println(x+" "+y);
				}
			}
		} catch (Exception e) {
			System.out.println("Exception!");
		}
	}
}