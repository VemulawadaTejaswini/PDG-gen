import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			final int N = scn.nextInt();
			final char[] S = scn.next().toCharArray();

			Set<Double> bs = new HashSet<>(4000);
			for (int b = 0; b < N; b++) {
				if (S[b] != 'B')
					continue;
				bs.add((double) b);
			}

			List<Integer> gs = new ArrayList<>(4000);
			for (int g = 0; g < N; g++) {
				if (S[g] != 'G')
					continue;
				gs.add(g);
			}

			long sum = 0;
			for (int r = 0; r < N; r++) {
				if (S[r] != 'R')
					continue;
				for (int g = 0; g < gs.size(); g++) {
					double max = Math.max(r, gs.get(g));
					double min = Math.min(r, gs.get(g));
					sum += bs.size()
							- (bs.contains(max - (max - min) * 2) ? 1 : 0) //bnx
							- (bs.contains(max - (max - min) / 2) ? 1 : 0)//nbx
							- (bs.contains(max + (max - min)) ? 1 : 0)//nxb
					;
				}
			}
			System.out.println(sum);
		}
	}
}