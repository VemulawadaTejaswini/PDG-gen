import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	public class Permutaiton {
		List<String> list;
		int N, M;

		public Permutaiton(int n, int m) {
			list = new ArrayList<String>();
			this.N = n;
			this.M = m;
		}

		public void generate() {
			StringBuilder sb = new StringBuilder(":");
			for (int i = 0 ; i < N ; i++) {
				sb.append(i).append(" ");
			}
			int m = this.M;
			rec_gen(sb.toString().trim(), m);
		}

		private void rec_gen(String s, int num) {
			String[] ss = s.split(":");
			String target = ss[0];

			if (num == 0) {
				list.add(target);
				return;
			}

			if (s.endsWith(":")) return;

			String[] remains = ss[1].split(" ");
			int R = remains.length;
			for (int i = 0 ; i < R ; i++) {
				StringBuilder sb = new StringBuilder(target);
				sb.append(" ").append(remains[i]).append(":");
				for (int j = 0 ; j < R ; j++) {
					if (Integer.parseInt(remains[j]) > Integer.parseInt(remains[i])) { sb.append(remains[j]).append(" "); }
				}
				rec_gen(sb.toString().trim(), num-1);
			}
		}
	}

	public long factorial(long n) {
        if (n == 1) return 1;
        else return n*factorial(n-1);
    }

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		Main x = new Main();

		while (sc.hasNext()) {
			int n = sc.nextInt(), s = sc.nextInt();

			if (n==0&&s==0) break;

			Permutaiton p = x.new Permutaiton(10, n);
			p.generate();

			//for (String ss : p.list) System.out.println(ss);

			int m = 0;
			for (String str : p.list) {
				String[] strs = str.split("\\s");
				int sum = 0;
				for (int i = 0 ; i < strs.length ; i++) {
					sum += Integer.parseInt(strs[i]);
				}
				if (sum == s) { m++; }
			}
			System.out.println(m);
		}

	}
}