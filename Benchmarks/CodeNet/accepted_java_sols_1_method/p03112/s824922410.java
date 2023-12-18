import java.util.*;

public class Main {
    static final int SIZE = 40;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int q = sc.nextInt();
		TreeSet<Long> shrines = new TreeSet<>();
		TreeSet<Long> temples = new TreeSet<>();
		for (int i = 0; i < a; i++) {
		    shrines.add(sc.nextLong());
		}
		for (int j = 0; j < b; j++) {
		    temples.add(sc.nextLong());
		}
		shrines.add(Long.MIN_VALUE / 10);
		shrines.add(Long.MAX_VALUE / 10);
		temples.add(Long.MIN_VALUE / 10);
		temples.add(Long.MAX_VALUE / 10);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
		    long x = sc.nextLong();
		    long leftShrine = x - shrines.lower(x);
		    long leftTemple = x - temples.lower(x);
		    long rightShrine = shrines.higher(x) - x;
		    long rightTemple = temples.higher(x) - x;
		    long min = Long.MAX_VALUE;
		    min = Math.min(min, Math.max(leftShrine, leftTemple));
		    min = Math.min(min, Math.max(rightShrine, rightTemple));
		    min = Math.min(min, Math.min(leftShrine, rightTemple) * 2 + Math.max(leftShrine, rightTemple));
		    min = Math.min(min, Math.min(rightShrine, leftTemple) * 2 + Math.max(rightShrine, leftTemple));
		    sb.append(min).append("\n");
		}
		System.out.print(sb);
    }
}

