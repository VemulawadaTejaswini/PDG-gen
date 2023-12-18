import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;

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
		HashMap<Integer, Long>	hash = new HashMap<Integer, Long>();
		LinkedHashSet<Integer>	keys = new LinkedHashSet<Integer>();
		int						cnt  = 0;

		while((cnt = parseCnt()) != 0) {
			int	res = 0;

			hash.clear();
			keys.clear();

			for (int l = 0; l < cnt; l++) {
				int[]	head = parseData();
				long	val  = (long)head[1] * (long)head[2];

				if (hash.containsKey(head[0])) {
					val += hash.get(head[0]);
				}

				hash.put(head[0], val);
				if (val >= (long)1000000) {
					keys.add(head[0]);
				}
			}

			res = keys.size();
			if (res == 0) {
				System.out.println("NA");
			} else {
				Iterator<Integer>	iter = keys.iterator();
				for (int i = 0; i < keys.size(); i++) {
					System.out.println(iter.next());
				}
			}
		}
	}

	private static int parseCnt() {
		int		cnt = 0;
		String	str = null;

		if ((str = parseStdin()) != null) {
			cnt = Integer.parseInt(str);
		}

		return cnt;
	}

	private static int[] parseData() {
		int[]	data = null;
		String	str  = null;

		if ((str = parseStdin()) != null) {
			String[]	lines = str.split(" ");

			if (lines.length > 0) {
				data = new int[lines.length];
				data[0] = Integer.parseInt(lines[0]);
				data[1] = Integer.parseInt(lines[1]);
				data[2] = Integer.parseInt(lines[2]);
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