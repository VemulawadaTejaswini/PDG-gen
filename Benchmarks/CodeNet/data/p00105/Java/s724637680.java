import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

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
		Index		index = null;
		IndexTbl	tbl   = new IndexTbl();
		int			cnt   = 0;
		int[][]		dat   = new int[100][101];

		while((index = parseIndex()) != null) {
			int	id = cnt;
			if (!tbl.containsKey(index.w)) {
				tbl.put(index.w, cnt++);
			} else {
				id = (Integer)tbl.get(index.w);
			}
			dat[id][0]++;
			dat[id][dat[id][0]] = index.i;
		}

		{
			IndexKey			keys = new IndexKey(tbl.keySet());
			Iterator<String>	iter = keys.iterator();

			while(iter.hasNext()) {
				String	out = "";
				String	key = iter.next();
				int		val = tbl.get(key);
				System.out.println(key);
				Arrays.sort(dat[val], 1, dat[val][0]+1);
				for (int l = 1; l <= dat[val][0]; l++) {
					out = (l == 1) ? "" + dat[val][l] : out + (" " + dat[val][l]);
				}
				System.out.println(out);
			}
		}
	}

	private static Index parseIndex() {
		String	str   = null;
		Index	index = null;

		if ((str = parseStdin()) != null) {
			String[]	lines = str.split(" ");

			if (lines.length == 2) {
				index   = new Index();
				index.w = lines[0];
				index.i = Integer.parseInt(lines[1]);
			}
		}
 
		return index;
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

class IndexTbl extends HashMap<String, Integer> {
}

class IndexKey extends TreeSet<String> {
	IndexKey(Set<String> set) {
		super(set);
	}
}

class Index {
	String	w;
	int		i;
}