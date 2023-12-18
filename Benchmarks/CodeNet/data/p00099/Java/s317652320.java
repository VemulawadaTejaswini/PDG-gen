import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

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

				if (map.containsKey(node[0])) {
					val = map.get(node[0]);
				}
				val += node[1];
				map.put(node[0], val);

				if (map.size() > 0) {
					ArrayList<Object>		arr = new ArrayList<Object>(map.entrySet());
					Map.Entry<Long, Long>	tmp = null;

					if (map.size() > 1) {
						Collections.sort(arr, new Comparator<Object>() {
							public int compare(Object obj1, Object obj2) {
								Map.Entry<Long, Long> ent1 = (Map.Entry<Long, Long>) obj1;
								Map.Entry<Long, Long> ent2 = (Map.Entry<Long, Long>) obj2;
								Long val1 = (Long) ent1.getValue();
								Long val2 = (Long) ent2.getValue();
								return val2.compareTo(val1);
							}
						});
					}

					tmp    = (Map.Entry<Long, Long>)arr.get(0);
					max[0] = tmp.getKey();
					max[1] = tmp.getValue();
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