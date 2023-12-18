import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w = sc.nextInt();
		ArrayList<Long> v1 = new ArrayList<>();
		ArrayList<Long> v2 = new ArrayList<>();
		ArrayList<Long> v3 = new ArrayList<>();
		ArrayList<Long> v4 = new ArrayList<>();
		long firW = sc.nextLong();
		long firV = sc.nextLong();
		v1.add(firV);
		for(int i = 0; i < n-1 ; i++) {
			int sa = (int) (sc.nextLong() - firW);
			switch (sa) {
			case 0:
				v1.add(sc.nextLong());
				break;
			case 1:
				v2.add(sc.nextLong());
				break;
			case 2:
				v3.add(sc.nextLong());
				break;
			case 3:
				v4.add(sc.nextLong());
				break;
			}
		}
		v1.sort(Comparator.reverseOrder());
		v2.sort(Comparator.reverseOrder());
		v3.sort(Comparator.reverseOrder());
		v4.sort(Comparator.reverseOrder());
		for(int i = 1; i < v1.size(); i++) {
			v1.set(i, v1.get(i-1)+v1.get(i));
		}
		for(int i = 1; i < v2.size(); i++) {
			v2.set(i, v2.get(i-1)+v2.get(i));
		}
		for(int i = 1; i < v3.size(); i++) {
			v3.set(i, v3.get(i-1)+v3.get(i));
		}
		for(int i = 1; i < v4.size(); i++) {
			v4.set(i, v4.get(i-1)+v4.get(i));
		}
		v1.add(0, 0L);
		v2.add(0, 0L);
		v3.add(0, 0L);
		v4.add(0, 0L);
		Long ans = 0L;
		for(int $1 = 0; $1 < v1.size(); $1++) {//0～size個まで取る
			for(int $2 = 0; $2 < v2.size(); $2++) {
				for(int $3 = 0; $3 < v3.size(); $3++) {
					for(int $4 = 0; $4 < v4.size(); $4++) {
						if(firW*$1 + (firW+1)*$2 + (firW+2)*$3 + (firW+3)*$4 <= w) {
							ans = Math.max(ans, v1.get($1)+v2.get($2)+v3.get($3)+v4.get($4));
						}
					}
				}
			}
		}
		System.out.println(ans);
	}
}