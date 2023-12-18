import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {
	private	static	BufferedReader		br   = null;
	private	static	ArrayList<Integer>	list = null;

	static {
		br   = new BufferedReader(new InputStreamReader(System.in));
		list = new ArrayList<Integer>();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String	strNum = null;
		int		nNum   = 0;
		int		nOut   = 0;

		while ((strNum = parseNum()) != null) {
			nNum = Integer.parseInt(strNum);
			if (nNum == 0) {
				nOut = list.get(0);
				list.remove(0);
				System.out.println(nOut);
			}
			else {
				list.add(0, nNum);
			}
		}
	}

	private static String parseNum() {
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