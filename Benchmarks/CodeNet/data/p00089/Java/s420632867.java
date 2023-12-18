import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


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
		calc();
	}
 
	private static boolean calc() {
		int					precnt = 0;
		int					curcnt = 0;
		String				strin  = null;
		ArrayList<int[]>	pretbl = null;
		ArrayList<int[]>	curtbl = null;
 
		while ((strin = parseStdin()) != null) {
			String[]	lines  = strin.split(",");

			curtbl = new ArrayList<int[]>();
			curcnt = lines.length;

			for(int cindex = 0; cindex < lines.length; cindex++) {

				if (pretbl == null) {
					int[]	citem  = new int[2];
					citem[0] = cindex;
					citem[1] = Integer.parseInt(lines[cindex]);
					curtbl.add(citem);
				} else {
					for(int pindex = 0; pindex < pretbl.size(); pindex++) {
						int[]	pitem = pretbl.get(pindex);
						if (curcnt >= precnt && pitem[0] != cindex && pitem[0] != cindex - 1) continue;
						if (curcnt <= precnt && pitem[0] != cindex && pitem[0] != cindex + 1) continue;
						int[]	citem  = new int[2];
						citem[0] = cindex;
						citem[1] = Integer.parseInt(lines[cindex]) + pitem[1];
						curtbl.add(citem);
					}
				}
			}

			Collections.sort(curtbl, new MyComparator());
			pretbl = curtbl;
			precnt = curcnt;
		}

		System.out.println(pretbl.get(0)[1]);

		return true;
	}
 
	private static String parseStdin() {
        String  stdin = null;
        
        try {
        	stdin = br.readLine();
        }
        catch (IOException e) {}
 
        return stdin;
	}
}

class MyComparator implements Comparator<int[]> {
    public int compare(int[] pos1,int[] pos2){
    	return (pos1[0] != pos2[0]) ? pos1[0] - pos2[0] : pos2[1] - pos1[1];
    }
}