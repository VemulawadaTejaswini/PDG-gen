import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


	public static void main(String[] args) {
		FastScanner fsc = new FastScanner();

		int SV = fsc.nextInt();
		int HW = fsc.nextInt();
		int[] HW_count = new int[HW];
		int Total = 0;
		for(int i = 0; HW > i; i++) {
			HW_count[i] = fsc.nextInt();
		}
		//遊べる残日数計算
		for(int num = 0; HW > num; num++ ) {
			Total = HW_count[num];
			SV = SV - Total;
		}

		//宿題が間に合わない
		if(SV < 0) {
			System.out.println(-1);
		}
		//遊べる日数を出力
		else if(SV >= 0) {
			System.out.println(SV);
		}
	}
}




class FastScanner {

	BufferedReader br;

	StringTokenizer st;



	public FastScanner() {

		br = new BufferedReader(new InputStreamReader(System.in));

	}



	String next() {

		while (st == null || !st.hasMoreElements()) {

			try {

				st = new StringTokenizer(br.readLine());

			} catch (IOException e) {

				e.printStackTrace();

			}

		}

		return st.nextToken();

	}



	int nextInt() {

		return Integer.parseInt(next());

	}



	long nextLong() {

		return Long.parseLong(next());

	}

}
