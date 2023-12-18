import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main {

	private static final int MAX = 1000000;

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<Integer>();
		Integer[] il;

		//
		for (int i = 2; i < MAX; i++) {
			hs.add(i);
		}

		for (int i = 2; i < MAX; i++) {
			hs.contains(Integer.valueOf(i));
			for (int j = 2; i * j < MAX; j++) {
				hs.remove(Integer.valueOf(i * j));
			}
		}

		il = hs.toArray(new Integer[0]);
		Arrays.sort(il);

		//
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		ArrayList<Integer> al = new ArrayList<Integer>();

		try {
			while ((s = br.readLine()) != null) {
				al.add(Integer.valueOf(s));
			}
			for (Integer i : al) {
				int count = 0;
				for (int j = 0; j < i; j++) {
					if (il[j] <= i)
						count++;
				}
				System.out.println(count);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}