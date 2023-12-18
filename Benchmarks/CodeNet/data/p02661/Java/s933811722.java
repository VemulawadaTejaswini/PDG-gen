import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static List<Ab> getStrings(Scanner sc, int num) {
		List<Ab> stringList = new ArrayList<>();
		while(num>0) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			stringList.add(new Ab(a,b));
			num--;
		}
		return stringList;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Ab> ablist = getStrings(sc, n);
		long suma = 0;
		long sumb = 0;
		List<Long> alist = new ArrayList<>();
		List<Long> blist = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			alist.add(ablist.get(i).a);
			blist.add(ablist.get(i).b);
		}
		alist.sort(Long::compareTo);
		blist.sort(Long::compareTo);
		double mediana = 0;
		double medianb = 0;
		if (n % 2 == 1) {
			mediana = alist.get((n+1)/2-1);
			medianb = blist.get((n+1)/2-1);
			System.out.println((long)(medianb - mediana + 1));
		} else {
			mediana = (alist.get(n/2-1) + alist.get(n/2))/2;
			medianb = (blist.get(n/2-1) + blist.get(n/2))/2;
			System.out.println((long)(medianb - mediana) * 2 + 1);
		}
		return;
	}

	public static class Ab {
		long a;
		long b;

		public Ab(long a, long b) {
			this.a = a;
			this.b = b;
		}
	}

}
