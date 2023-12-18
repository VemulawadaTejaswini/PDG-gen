import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		solver();
	}

	static void solver() {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int d = sc.nextInt();
			if (n == 0 && d == 0)
				return;

			ArrayList<Country> cs = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				int m = sc.nextInt();
				int[] c = new int[m];
				for (int j = 0; j < m; j++) {
					c[j] = sc.nextInt();
				}
				cs.add(new Country(i, c, m));
			}
			cs.sort(null);
			int max = cs.get(cs.size() - 1).sum;
			int min = cs.get(0).sum;
			int max2=min;
			if(cs.size()>=2){
				max2=cs.get(cs.size()-2).num;
			}
			while (max - min <= d) {
				boolean removed = false;
				cs.sort(null);
				
				max = cs.get(cs.size() - 1).sum;
				max2=cs.get(cs.size()-2).sum;
				min = Math.min(cs.get(0).sum, min);

				for (int i = 0; i < cs.size(); i++) {
					Country nc = cs.get(i);
					int ns = nc.sum - nc.c.get(0);
					if (((i != 0 && Math.abs(ns - max) <= d)||(i==0&& Math.abs(ns - max2) <= d)) && Math.abs(ns - min) <= d) {
						cs.get(i).sum = ns;
						cs.get(i).c.remove(0);
						if (ns == 0) {
							cs.remove(i);
						}
						removed = true;
						break;
					}
				}
				if (!removed) {
					if (cs.size() == 0) {
						System.out.println("YES");
					} else
						System.out.println("NO");
					break;
				}else if(cs.size()==0){
					System.out.println("YES");
					break;
				}
			}
		}
	}
	static void tr(Object...o){System.out.println(Arrays.deepToString(o));}

	static class Country implements Comparable<Country> {
		int num;
		int sum = 0;
		ArrayList<Integer> c=new ArrayList<>();

		Country(int num, int[] c, int m) {
			this.num = num;
			for (int i = 0; i < m; i++) {
				this.c.add(c[i]);
				this.sum += c[i];
			}
		}

		@Override
		public int compareTo(Country o) {
			return Integer.compare(this.sum, o.sum);
		}
	}
}