
import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	class score implements Comparable<score> {
		String id;
		int s;

		score(Scanner sc) {
			id = sc.next();
			int f = 0;
			int x1 = 0;
			int x2 = 0;
			int c = 0;
			int q = 0;
			int e = 0;
			s = 0;
			for (;;) {
				if(f == 9 && e == 1 && c==3){
					break;
				}
				if(f == 9 && e == 0 && c==2){
					break;
				}
				int v = sc.nextInt();
				if (x1 > 0) {
					x1--;
					s+=v;
				}
				if (x2 > 0) {
					x2--;
					x1++;
					s+=v;
				}
				s+=v;
//				System.out.println(s);
				if (f == 9) {
					if(c==0){
						if(v==10){
							e=1;
						}
						q=v;
						c++;
					}else if(c== 1 && q+v==10){
						e=1;
						c++;
					}else{
						c++;
					}
				} else if (v == 10) {
					x2 += 1;
					c = 0;
					q=0;
					f++;
				} else if (q + v == 10) {
					x1 += 1;
					c = 0;
					q=0;
					f++;
				} else if (c == 1) {
					c = 0;
					q=0;
					f++;
				} else {
					q = v;
					c++;
				}
			}
		}

		@Override
		public int compareTo(score arg0) {
			int a;
			a = arg0.s - s;
			if (a == 0) {
				a = -id.compareTo(arg0.id);
			}
			return a;
		}
		
	}

	void run() {
		for (;;) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}

			score[] c = new score[n];
			for(int i =0;i<n;i++){
			//	System.out.println(i);
				c[i] = new score(sc);
			}
			Arrays.sort(c);
			
			for(int i =0 ; i < n;i++){
				System.out.println(c[i].id+" "+c[i].s);
			}
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}