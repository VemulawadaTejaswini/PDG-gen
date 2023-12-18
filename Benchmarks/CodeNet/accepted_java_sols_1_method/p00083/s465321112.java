import java.io.*;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;
		int start_year[] = {1868,1912,1926,1989};

		try {
			while ((buf = br.readLine())!=null) {
				StringTokenizer st = new StringTokenizer(buf);
				int y = Integer.parseInt(st.nextToken());
				int m = Integer.parseInt(st.nextToken());
				int d = Integer.parseInt(st.nextToken());
				String gengo;
				int pass = 0;
				if (y<=1867) {
					gengo = "pre-meiji";
				} else if (y==1868) {
					if (m<=8) gengo = "pre-meiji";
					else if (m==9&&d<=7) gengo = "pre-meiji";
					else {
						gengo = "meiji";
						pass = start_year[0];
					}
				} else if (y<=1911) {
					gengo = "meiji";
					pass = start_year[0];
				} else if (y==1912) {
					if (m<=6) {
						gengo = "meiji";
						pass = start_year[0];
					} else if (m==7&&d<=29) {
						gengo = "meiji";
						pass = start_year[0];
					} else {
						gengo = "taisho";
						pass = start_year[1];
					}
				} else if (y<=1925) {
					gengo = "taisho";
					pass = start_year[1];
				} else if (y==1926) {
					if (m==12&&d>=25) {
						gengo = "showa";
						pass = start_year[2];
					} else {
						gengo = "taisho";
						pass = start_year[1];
					}
				} else if (y<=1988) {
					gengo = "showa";
					pass = start_year[2];
				} else if (y==1989) {
					if (m==1&&d<=7) {
						gengo = "showa";
						pass = start_year[2];
					} else {
						gengo = "heisei";
						pass = start_year[3];
					}
				} else {
					gengo = "heisei";
					pass = start_year[3];
				}

				if (pass!=0) {
					System.out.println(gengo+" "+(y-pass+1)+" "+m+" "+d);
				} else {
					System.out.println(gengo);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}