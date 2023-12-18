import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;


public class Main {
	private	static	BufferedReader	br = null;
	private	static	RecordCmp		rc = null;

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
		rc = new RecordCmp();
	}
 
    /**
     * @param args
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Record[]	rec  = null;
		Record[][]	recs = null;

		while ((rec = parseRecord()) != null) {
			recs = new Record[4][];
			recs[0] = rec;
			recs[1] = parseRecord();
			recs[2] = parseRecord();
			recs[3] = new Record[6];

			for (int i = 0; i < 6; i++) {
				recs[3][i] = recs[i/2][2+i%2];
			}
			Arrays.sort(recs[3], rc);

			for (int i = 0; i < 8; i++) {
				System.out.println(recs[i/2][i%2].n+" "+recs[i/2][i%2].t);
			}
		}
	}
 
	private static Record[] parseRecord() {
		Record[]	rec = null;

		for (int i = 0; i < 8; i++) {
			String	str = parseStdin();
			if (str == null) break;
			if (rec == null) rec = new Record[8];
			rec[i] = new Record(str.split(" "));
			if (i == 7) Arrays.sort(rec, rc);
		}
		return rec;
	}
 
	private static String parseStdin() {
        String  stdin = null;
        
        try {
        	String  tmp = br.readLine();
        	if (tmp != null) {
            	if (!tmp.isEmpty()) stdin = tmp;
        	}
        }
        catch (IOException e) {}
 
        return stdin;
	}
}

class Record {
	public	int		n;
	public	double	t;

	public Record(String[] param) {
		n = Integer.parseInt(param[0]);
		t = Double.parseDouble(param[1]);
	}
}

class RecordCmp implements Comparator<Record> {
   public int compare(Record rc1, Record rc2) {
       return (rc1.t < rc2.t) ? -1 : (rc1.t > rc2.t) ? 1 : 0;
   }
}