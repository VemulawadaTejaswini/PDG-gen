import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


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
 
	private static void calc() {
		int[]	curtbl = null;
		int[]	pretbl = null;
 
		while ((curtbl = parseParams()) != null) {
			if (pretbl == null) {
				pretbl = curtbl;
			}
			else {
				int[]	tmptbl = new int[curtbl.length];
				for(int i = 0; i < tmptbl.length; i++) {
					if (0 <= i && i < pretbl.length) {
						tmptbl[i] = Math.max(tmptbl[i], pretbl[i] + curtbl[i]);
					}

					if (tmptbl.length > pretbl.length) {
						if (0 <= i-1 && i-1 < pretbl.length) {
							tmptbl[i] = Math.max(tmptbl[i], pretbl[i-1] + curtbl[i]);
						}
					}
					else {
						if (0 <= i+1 && i+1 < pretbl.length) {
							tmptbl[i] = Math.max(tmptbl[i], pretbl[i+1] + curtbl[i]);
						}
					}
				}
				pretbl = tmptbl;
			}
		}

		System.out.println(pretbl[0]);
	}
 
	private static int[] parseParams() {
        int[]	params = null;
        String  strin  = null;

        if ((strin = parseStdin()) != null) {
        	String[]	lines = strin.split(",");
        	params = new int[lines.length];
        	for (int index = 0; index < lines.length; index++) {
        		params[index] = Integer.parseInt(lines[index]);
        	}
        }
 
        return params;
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