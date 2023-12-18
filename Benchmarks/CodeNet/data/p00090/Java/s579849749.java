import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.BitSet;

/**
 * Overlaps of Seals
 */
public class Main {

	static char DELIM = ',';
	static int OVERLAP = 4;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = Integer.parseInt(line);
			if (n == 0) break;

			double[][] coords = new double[n][2];

			for (int i = 0; i < n; i++) {
				line = br.readLine();
				coords[i][0] = Double.parseDouble(line.substring(0, line.indexOf(DELIM)));
				coords[i][1] = Double.parseDouble(line.substring(line.indexOf(DELIM) + 1));
			}

			BitSet[] overlaps = new BitSet[n];
			for (int i = 0; i < n; i++) {
				overlaps[i] = new BitSet(n);
			}

			// calc distance.
			int bitsMax = 0;
			for (int i = 0; i < n; i++) {
				int _bitsMax = 0;
				for (int j = 0; j < n; j++) {
					if (i == j || (i < j && Math.pow(coords[i][0] - coords[j][0], 2)
							+ Math.pow(coords[i][1] - coords[j][1], 2) <= OVERLAP)) {
						overlaps[i].set(j);
						overlaps[j].set(i);
						_bitsMax++;
						if (_bitsMax > bitsMax) bitsMax = _bitsMax;
					}
				}
			}

			// solve.
			int overlapMax = 0;
			for (int i = 0; i < n; i++) {
				if (overlaps[i].cardinality() == bitsMax) {
					BitSet b = (BitSet) overlaps[i].clone();
					for (int j = 0; j < n; j++) {
						if (i != j && b.get(j)) {
							b.and(overlaps[j]);
						}
					}
					if (b.cardinality() > overlapMax) overlapMax = b.cardinality();
				}
			}

			System.out.println(overlapMax);

		} // end while
	} // end main
}