import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sn = new Scanner(System.in);
		
		Integer N = Integer.parseInt(sn.nextLine());
		String[] PsStr = sn.nextLine().split(" ");
		Integer[] Ps = conv(PsStr, N);
		Integer[] sorted = Arrays.copyOf(Ps, N);
		Arrays.sort(sorted);
		
		if (comp(Ps, sorted) == 0) {
			System.out.println("YES");
			return;
		}
		
		int srcIndex = -1;
		int toIndex = -1;
		for (int i = 0; i < Ps.length; i++) {
			if (Ps[i].equals(sorted[i])) {
				continue;
			}
			srcIndex = i;
			toIndex = getToIndex(Ps[i], sorted);
			break;
		}
		
		int src = Ps[toIndex];
		int to = Ps[srcIndex];
		
		Ps[srcIndex] = src;
		Ps[toIndex] = to;
		
		System.out.println((comp(Ps, sorted) == 0 ? "YES" : "NO"));
	}
	
	private static Integer[] conv(String[] PsStr, int N) {
		Integer[] Ps = new Integer[N];
		for (int i = 0; i < PsStr.length; i++) {
			Ps[i] = Integer.parseInt(PsStr[i]);
		}
		return Ps;
	}
	private static int comp(Integer[] Ps, Integer[] sorted) {
		for (int i = 0; i < Ps.length; i++) {
			if (Ps[i] != sorted[i]) {
				return -1;
			}
		}
		return 0;
	}
	
	private static int getToIndex(Integer p, Integer[] sorted) {
		for (int i = 0; i < sorted.length; i++) {
			if (sorted[i] == p) {
				return i;
			}
		}
		return -1;
	}
}