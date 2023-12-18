import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		boolean[] time = new boolean[24*60];
		while (true) {
			int n = sc.nextInt();
			String sp = sc.next(), sq = sc.next();
			if (n == 0 && sp.equals("0") && sq.equals("0")) break;
			int p = Integer.parseInt(sp.substring(0, sp.length()-2))*60+Integer.parseInt(sp.substring(sp.length()-2));
			int q = Integer.parseInt(sq.substring(0, sq.length()-2))*60+Integer.parseInt(sq.substring(sq.length()-2));
			
			Arrays.fill(time, false);
			
			for (int z = 0; z < n; z++) {
				int k = sc.nextInt();
				int i = p;
				for (int y = 0; y < k; y++) {
					String s1 = sc.next(), s2 = sc.next();
					for (int j = i; j < Integer.parseInt(s1.substring(0, s1.length()-2))*60+Integer.parseInt(s1.substring(s1.length()-2)); j++) {
						time[j] = true;
					}
					i = Integer.parseInt(s2.substring(0, s2.length()-2))*60+Integer.parseInt(s2.substring(s2.length()-2));
				}
				for (int j = i; j < q; j++)
					time[j] = true;
			}
			int res = 0;
			
			int i = p;
			while (i < q) {
				if (time[i]) {
					int c = 0;
					while (i < q && time[i]) {
						i++;
						c++;
					}
					res = Math.max(res, c);
				} else {
					while (i < q && !time[i]) i++;
				}
			}
			
			out.println(res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}