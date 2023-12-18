import java.util.*;
public class Main {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			while (true) {
				int n = sc.nextInt();
				int w = sc.nextInt();
				int d = sc.nextInt();
				if(n == 0 && w == 0 && d== 0) break;
				ArrayList<Data> list = new ArrayList<Data>();
				list.add(new Data(w, d, 0));
				for (int i = 1; i <= n; i++) {
					int p = sc.nextInt();
					int s = sc.nextInt();
					Data tmp = list.get(p - 1);
					int nw = 0;
					int nd = 0;
					int status = 0;
					for (int j = 0; j < s; j++) {
						if (status == 0) {
							nw++;
							if (nw == tmp.w) {
								status++;
							}
						} else if (status == 1) {
							nd++;
							if (nd == tmp.d) {
								status++;
							}
						} else if (status == 2) {
							nw--;
							if (nw == 0) {
								status++;
							}
						} else {
							nd--;
							if (nd == 0) {
								status = 0;
							}
						}
					}

					if (status == 0 || status == 2) {
						Data p1 = new Data(nw, tmp.d, i);
						Data p2 = new Data(tmp.w - nw, tmp.d, i);
						if (p1.d * p1.w < p2.d * p2.w) {
							list.add(p1);
							list.add(p2);
						} else {
							list.add(p2);
							list.add(p1);
						}
					} else {
						Data p1 = new Data(tmp.w, nd, i);
						Data p2 = new Data(tmp.w, tmp.d - nd, i);
						if (p1.d * p1.w < p2.d * p2.w) {
							list.add(p1);
							list.add(p2);
						} else {
							list.add(p2);
							list.add(p1);
						}
					}
					list.remove(p - 1);

				}
				Collections.sort(list, new MyComp());
				System.out.print(list.get(0).d * list.get(0).w);
				for (int i = 1; i < list.size(); i++) {
					System.out.print(" " + list.get(i).d * list.get(i).w);
				}
				System.out.println();
			}
			
	}
	
	static class Data {
		int w;
		int d;
		int t;
		Data(int a, int b, int c) {
			w = a;
			d = b;
			t = c;
		}
	}
	
	static class MyComp implements Comparator<Data> {

		@Override
		public int compare(Data o1, Data o2) {
			return o1.d*o1.w - o2.d*o2.w;
		}
		
	}
}