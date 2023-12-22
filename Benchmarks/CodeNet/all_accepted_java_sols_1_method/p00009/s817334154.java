import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.BitSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BitSet bs = new BitSet(1000000);
		bs.set(0, 1000000);
		bs.clear(0);
		bs.clear(1);
		for (int i = bs.nextSetBit(0); i >= 0; i = bs.nextSetBit(i + 1)) {
			int val = i;
			do {
				val += i;
				bs.clear(val);
			} while (val < 1000000);
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while ((s = br.readLine()) != null) {
			System.out.println(bs.get(0, Integer.parseInt(s) + 1).cardinality());
		}
	}
}