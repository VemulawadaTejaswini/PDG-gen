import java.io.*;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		boolean First = true;
		double x,y,kaku;
		x = y = kaku = 0;

		try {
			while (true) {
				StringTokenizer st = new StringTokenizer(br.readLine(),",");
				int hosuu = Integer.parseInt(st.nextToken());
				int houkou = Integer.parseInt(st.nextToken());
				if (hosuu==0&&houkou==0) break;
				if (First) {
					x = 0;
					y = hosuu;
					kaku = (Math.PI/2)-houkou*(Math.PI/180);
					First = false;					
				} else {
					x += hosuu*Math.cos(kaku);
					y += hosuu*Math.sin(kaku);
					kaku -= houkou*(Math.PI/180);
				}
			}
			System.out.println((int)x);
			System.out.println((int)y);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}