import java.io.*;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int n = Integer.parseInt(br.readLine());
			for (int i=0;i<n;i++) {
				int b[] = {0,0,0};
				int score = 0;
				int outcount = 0;
				while (outcount<3) {
					String op = br.readLine();
					if (op.equals("HIT")) {
						if (b[2]==1) {
							score++;
							b[2] = 0;
						}
						if (b[1]==1) {
							b[2] = 1;
							b[1] = 0;
						}
						if (b[0]==1) {
							b[1] = 1;
						}
						b[0] = 1;
					} else if (op.equals("HOMERUN")) {
						score++;
						for (int j=0;j<3;j++) {
							if (b[j]==1) {
								score++;
								b[j] = 0;
							}
						}
					} else if (op.equals("OUT")) outcount++;
					System.out.println(b[0]+" "+b[1]+" "+b[2]+" "+score);
				}
				System.out.println(score);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}