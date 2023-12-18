import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

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
		HashMap<Long, Long>	map  = new HashMap<Long, Long>();
		long[]				max  = { (long)-1, Long.MIN_VALUE };
		long[]				head = parseData();

		if (head != null) {
			for (int q = 0; q < head[1]; q++) {
				long[]	node = parseData();
				Long	val  = (long)0;
				int		size = 0;

				if (map.containsKey(node[0])) {
					val = map.get(node[0]);
				}
				val += node[1];
				map.put(node[0], val);

				size = map.size();
				if (size > 1) {
					Set<Entry<Long, Long>>	entry = map.entrySet();
					Object[]				ttt   = entry.toArray();

					for (int l = 0; l < ttt.length; l++) {
						long	ckey = ((Entry<Long, Long>)ttt[l]).getKey();
						long	cval = ((Entry<Long, Long>)ttt[l]).getValue();

						if (l == 0 || max[1] < cval || max[1] == cval && max[0] > ckey) {
							max[0] = ckey;
							max[1] = cval;
						}
					}
				} else {
					max[0] = node[0];
					max[1] = val;
				}

				System.out.println(max[0] + " " + max[1]);
			}
		}
	}

	private static long[] parseData() {
		long[]	data = null;
		String	str  = null;

		if ((str = parseStdin()) != null) {
			String[]	lines = str.split(" ");

			if (lines.length > 0) {
				data = new long[lines.length];
				for (int x = 0; x < lines.length; x++) {
					data[x] = Long.parseLong(lines[x]);
				}
			}
		}

		return data;
	}

	private static String parseStdin() {
        String  stdin = null;
        
        try {
        	String  tmp = br.readLine();
        	if (tmp != null) {
            	if (!tmp.isEmpty()) {
            		stdin = tmp;
            	}
        	}
        }
        catch (IOException e) {}
 
        return stdin;
	}
}