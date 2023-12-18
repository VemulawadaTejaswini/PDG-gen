import java.io.*;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			while (!(buf = br.readLine()).equals("0")) {
				int n = Integer.parseInt(buf);
				for (int i=0;i<n;i++) {
					StringTokenizer st = new StringTokenizer(br.readLine());
					int pm = Integer.parseInt(st.nextToken());
					int pe = Integer.parseInt(st.nextToken());
					int pj = Integer.parseInt(st.nextToken());
					System.out.println(classify(pm,pe,pj));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String classify(int pm,int pe,int pj) {
		if (pm==100||pe==100||pj==100) return "A";
		if ((pm+pe)/2>=90) return "A";
		int ave = (pm+pe+pj)/3;
		if (ave>=80) return "A";
		if (ave>=70) return "B";
		if (ave>=50) {
			if (pm>=80||pe>=80) return "B";
		}
		return "C";
	}
}