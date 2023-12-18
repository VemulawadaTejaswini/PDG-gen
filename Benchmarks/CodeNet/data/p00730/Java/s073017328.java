
import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	class cake implements Comparable<cake>{
		int w;
		int d;
		int s;

		cake a;
		cake b;

		cake(int w, int d) {
			this.w = w;
			this.d = d;
			this.s = w * d;
		}

		void cut(int si) {
			int[] wd = { w , d  };
			int oz = 0;
			while (si - wd[oz] >= 0) {
				si -= wd[oz];
				oz = oz ^ 1;
			}
			if (oz == 0) {
				if ( w -si>si) {
					a = new cake(si, d);
					b = new cake(w - si, d);
				} else {
					b = new cake(si, d);
					a = new cake(w - si, d);
				}
			} else {
				if (si < d / 2) {
					a = new cake(w, si);
					b = new cake(w, d - si);
				} else {
					b = new cake(w, si);
					a = new cake(w, d - si);
				}
			}
		}

		@Override
		public int compareTo(cake arg0) {
			return this.s - arg0.s;
		}
		
		public String toString(){
			return this.w+" " + this.d;
		}
	}

	void run() {
		for (;;) {
			int n = sc.nextInt();
			int w = sc.nextInt();
			int d = sc.nextInt();

			if ((n | w | d) == 0) {
				break;
			}

			LinkedList<cake> ck = new LinkedList<cake>();
			cake root = new cake(w,d);
			ck.add(root);
			for(int i =0 ; i < n ; i++){
				int p = sc.nextInt()-1;
				int si = sc.nextInt();
				
				cake t = ck.get(p);
				ck.remove(p);
				t.cut(si);
				
				ck.add(t.a);
				ck.add(t.b);
			/*	
				System.out.println("--");
				for(int q = 0; q < ck.size();q++){
					System.out.println(ck.get(q).toString());
				}
				*/
			}
			cake[] arr = ck.toArray(new cake[0]);
			Arrays.sort(arr);
			for(int i = 0 ; i < arr.length; i++){
				if(i != 0){
					System.out.print(" ");
				}
				System.out.print(arr[i].s);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}