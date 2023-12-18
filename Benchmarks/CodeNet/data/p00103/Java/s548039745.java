import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	final static String EVENT_HIT = "HIT";
	final static String EVENT_HOMERUN = "HOMERUN";
	//final static String EVENT_OUT = "OUT";

	static Main main = new Main();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String event = "";

		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			Inning inning = main.new Inning(0);
			while ((event = br.readLine()) != null) {
				if (event.equals(EVENT_HIT)) {
					inning.singleHit();
				} else if (event.equals(EVENT_HOMERUN)) {
					inning.homeRun();
				} else {
					inning.out();
				}
				if (inning.outs == 3) {
					System.out.println(inning.run);
					break;
				}
			}
		}
	}

	class Inning {

		int diamond;
		int outs;
		int run;

		Inning(int run) {
			diamond = 0;
			outs = 0;
			this.run = run;
		}

		void singleHit() {
			diamond <<= 1;
			diamond |= 1;
			if ((diamond & 8) > 0) {
				run++;
				diamond &= 7;
			}
		}

		void homeRun() {
			for (int i = 0; i < 3; i++) {
				diamond <<= 1;
				if ((diamond & 8) > 0)
					run++;
			}
			run++;
			diamond = 0;
		}

		void out() {
			outs++;
		}
	}
}