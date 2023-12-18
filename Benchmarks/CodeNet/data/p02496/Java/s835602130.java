import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		final String[] suit = {"S", "H", "C", "D"};
		final BitSet bs = new BitSet(4*13);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = Integer.parseInt(br.readLine());
		for (int i = 0; i < max; i++) {
			String[] in = br.readLine().split(" ");
			int num = Integer.parseInt(in[1]);
			for (int j = 0; j < suit.length; j++) if (suit[j].equals(in[0])) bs.set((j*13)+num-1);
		}
		for (int k = 1; k <= bs.length(); k++) {
			if (!bs.get(k-1)) System.out.println(suit[k/13] + " " + (k-(13*(k/13))));
		}
	}
}