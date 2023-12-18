import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


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
		int[]	params = null;
		String	out    = "";

		while ((params = parseParams()) != null) {
	        ArrayList<Integer>	player = new ArrayList<Integer>();
			int					curr   = 0;

			for (int n = 1; n <= params[0]; n++) {
				player.add(n);
			}
			
			while(player.size() > 1) {
				curr = (curr + params[1] - 1) % player.size();
				player.remove(curr);
			}

			out += String.format("%d\n", player.get(0));
		}

		System.out.print(out);
	}

	private static  int[] parseParams() {
		int[]		params = null;
		String[]	split  = null;
		String		strIn  = null;
 
		if ((strIn = parseStdin()) != null) {
			split  = strIn.split(" ");
			params = new int[split.length];
			for (int n = 0; n < split.length; n++) {
				params[n] = Integer.parseInt(split[n]);
			}

			if (params[0] == 0 && params[1] == 0) {
				params = null;
			}
		}
		 
		return params;
	}
 
	private static String parseStdin() {
		String	strNum = null;
 
		try {
			String line = br.readLine();
			if (line != null) {
				if (!line.isEmpty()) {
					strNum = line;
				}
			}
		}
		catch (IOException e) {}
 
		return strNum;
	}
}