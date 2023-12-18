import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		try {
			String buf = null;
			int score[] = new int[2];
			int n;
			while (!(buf = br.readLine()).equals("0")) {
				n = Integer.parseInt(buf);
				score[0] = score[1] = 0;
				for (int i=0;i<n;i++) {
					StringTokenizer st = new StringTokenizer(br.readLine(), " ");
					int a_score = Integer.parseInt(st.nextToken());
					int b_score = Integer.parseInt(st.nextToken());
					if (a_score>b_score) {
						score[0] += (a_score+b_score);
					} else if (a_score<b_score) {
						score[1] += (a_score+b_score);
					} else {
						score[0] += a_score;
						score[1] += b_score;
					}
				}
				System.out.println(score[0]+" "+score[1]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}