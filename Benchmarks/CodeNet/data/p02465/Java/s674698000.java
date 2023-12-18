import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Main {

	public static void main(String[] args) {
		Set<Long> setA = new TreeSet<Long>();
		Set<Long> setB = new TreeSet<Long>();
		try (Scanner sc = new Scanner(System.in)){
			int times = sc.nextInt();
			for (int i=0; i<times; i++) setA.add(sc.nextLong());
			times = sc.nextInt();
			for (int i=0; i<times; i++) setB.add(sc.nextLong());
			ArrayList<Long>  a = new ArrayList<Long>(setB);
			for (int i=0; i<times; i++) {
				Long l = a.get(i);
				boolean check = setA.contains(l);
				if (check) setA.remove(l);  //重複した場合削除
			}
			a = new ArrayList<Long>(setA);
			for (int i=0; i<a.size(); i++) System.out.println(a.get(i));
		}
	}
}
