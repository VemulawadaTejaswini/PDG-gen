import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;


public class Main {
	private	static	BufferedReader	br = null;

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String						stdin  = null;
		Integer						client = 0;
		HashMap<Integer, Integer>	cmonth = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer>	pmonth = new HashMap<Integer, Integer>();
		ArrayList<int[]>			result = new ArrayList<int[]>();

		while (!(stdin = parseStdin()).isEmpty()) {
			client = Integer.parseInt(stdin.split(",")[0]);
			if (!cmonth.containsKey(client)) {
				cmonth.put(client, 1);
			}
			else {
				cmonth.put(client, cmonth.get(client) + 1);
			}
		}

		while ((stdin = parseStdin()) != null) {
			if (stdin.isEmpty()) {
				continue;
			}

			client = Integer.parseInt(stdin.split(",")[0]);
			if (!pmonth.containsKey(client)) {
				pmonth.put(client, 1);
			}
			else {
				pmonth.put(client, cmonth.get(client) + 1);
			}
		}

		for (Object o : pmonth.keySet().toArray()) {
			if (cmonth.containsKey(o)) {
				int[]	item = {(Integer)o, (cmonth.get(o) + pmonth.get(o))};
				result.add(item);
			}
		}

		Collections.sort(result, new MyComparator());

		for (Object o : result.toArray()) {
			int[]	item = (int[])o;
			System.out.printf("%d %d\n", item[0], item[1]);
		}
	}

	private static String parseStdin() {
		String	stdin = null;

		try {
			stdin = br.readLine();
		}
		catch (IOException e) {}

		return stdin;
	}
}

class MyComparator implements Comparator<int[]> {

    /** ソート対象のカラムの位置 */
    public int compare( int[] a1, int[] a2 ) {
        return (a1[1] != a2[1]) ? a1[1] - a2[1] : a1[0] - a2[0];
    }
}