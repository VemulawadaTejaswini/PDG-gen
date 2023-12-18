import java.util.Arrays;
import java.util.Scanner;
public class Main {
	Scanner sc = new Scanner(System.in);
	final int NUM_CONTEST = 26;
	int D;
	int [] c  = new int[NUM_CONTEST];
	int [][] s ;
	int [] t ;
	int [] last_day;
	void A() {
		D = sc.nextInt();
		s = new int[D][NUM_CONTEST];
		for(int i = 0; i < NUM_CONTEST; i++) {
			c[i] = sc.nextInt();
		}
		for(int i = 0; i < D; i++) {
			for(int j = 0; j < NUM_CONTEST; j++) {
				s[i][j] = sc.nextInt();
			}
			//System.out.println(Arrays.toString(s[i]));
		}

		t = new int[D];

//		for(int i = 0; i < D; i++) {
//			t[i] = sc.nextInt() - 1;
//		}
		last_day = new int[NUM_CONTEST];
		Arrays.fill(last_day, -1);
//		long ans = 0;
		for(int d = 0; d < D; d++) {
			int max_contest = 0, max_value = Integer.MIN_VALUE;
			for(int cand = 0; cand < NUM_CONTEST; cand++) {
				int inc = s[d][cand];
				int last_day_old = last_day[cand];
				last_day[cand] = d;
				int dec = 0;
				for(int i = 0; i < NUM_CONTEST; i++) {
					dec += c[i] * (d - last_day[i]);
				}
				if(inc - dec > max_value) {
					max_value = inc - dec;
					max_contest = cand;
				}
				last_day[cand] = last_day_old;
			}
			last_day[max_contest] = d;
			t[d] = max_contest;
			//System.out.println(max_contest + 1);
		}
		long [] ans = new long[D+1];
		f(ans);
		//System.out.println("Answer=" + ans[D]);
		long work = ans[D];
		int try_times = 1000;
		while(--try_times >= 0) {
			int d = (int)(Math.random() * D);
			int q = (int)(Math.random() * NUM_CONTEST);
			int old = t[d];
			t[d] = q;
			ans = new long[D+1];
			f(ans);
			//System.out.println(ans[D]);
			if(ans[D] > work) {
				ans[D] = work;
				//System.out.println("" + try_times + ":" + ans[D]);

			} else {
				t[d] = old;
			}
		}
		for(int i = 0; i < t.length; i++) {
			System.out.println(t[i] + 1);
		}
	}
	void B() {
		D = sc.nextInt();
		s = new int[D][NUM_CONTEST];
		for(int i = 0; i < NUM_CONTEST; i++) {
			c[i] = sc.nextInt();
		}
		for(int i = 0; i < D; i++) {
			for(int j = 0; j < NUM_CONTEST; j++) {
				s[i][j] = sc.nextInt();
			}
			//System.out.println(Arrays.toString(s[i]));
		}

		t = new int[D];
		last_day = new int[NUM_CONTEST];
		Arrays.fill(last_day, -1);
		for(int i = 0; i < D; i++) {
			t[i] = sc.nextInt() - 1;
		}
		long ans = 0;
		for(int d = 0; d < D; d++) {
			int inc = s[d][t[d]];
			last_day[t[d]] = d;
			int dec = 0;
			for(int i = 0; i < NUM_CONTEST; i++) {
				dec += c[i] * (d - last_day[i]);
			}
			//System.out.println(inc + " " + dec + " " + (inc - dec));
			ans += (inc - dec);
			System.out.println(ans);

		}
	}
	void f(long [] ans) {
		last_day = new int[NUM_CONTEST];
		Arrays.fill(last_day, -1);
		for(int d = 0; d < D; d++) {
			int inc = s[d][t[d]];
			last_day[t[d]] = d;
			int dec = 0;
			for(int i = 0; i < NUM_CONTEST; i++) {
				dec += c[i] * (d - last_day[i]);
			}
			//System.out.println(inc + " " + dec + " " + (inc - dec));
			ans[d+1] = ans[d] + (inc - dec);

		}

	}
	void C() {

		D = sc.nextInt();
		s = new int[D][NUM_CONTEST];
		for(int i = 0; i < NUM_CONTEST; i++) {
			c[i] = sc.nextInt();
		}
		for(int i = 0; i < D; i++) {
			for(int j = 0; j < NUM_CONTEST; j++) {
				s[i][j] = sc.nextInt();
			}
			//System.out.println(Arrays.toString(s[i]));
		}

		t = new int[D];
		for(int i = 0; i < D; i++) {
			t[i] = sc.nextInt() - 1;
		}
		long [] ans = new long[D+1];
		f(ans);
		//System.out.println(Arrays.toString(ans));
		int M = sc.nextInt();
		for(int i = 0; i < M; i++) {
			int d = sc.nextInt() - 1;
			int q = sc.nextInt() - 1;
			t[d] = q;
			ans = new long[D+1];
			f(ans);
			//System.out.println(Arrays.toString(ans));
			System.out.println(ans[D]);
		}
	}
	void doIt() {
		A();
	}
	public static void main(String[] args) {
		new  Main().doIt();
	}

}
