import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {
	private	static	BufferedReader br = null;

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>	point   = new ArrayList<Integer>();
		double[][]			tresure = new double[1000][2];
		double				angle   = 0.0;
		int					num     = 0;
		int					max     = 0;

		tresure[0][0] = 1.0;
		tresure[0][1] = 1.0;//0.0;
		while ((num = parseNum()) != -1) {
			point.add(num);
			max = Math.max(max, num);
		}

		tresure[1][0] = 1.0;
		tresure[1][1] = 1.0;
		for(int n = 2; n < max; n++) {
			angle = Math.atan2(-tresure[n - 1][1], -tresure[n - 1][0]) / Math.PI * 180.0 + 90.0;
			tresure[n][0] = tresure[n - 1][0] - Math.cos(angle / 180.0 * Math.PI);
			tresure[n][1] = tresure[n - 1][1] - Math.sin(angle / 180.0 * Math.PI);
		}

		for(int n = 0; n < point.size(); n++) {
			int	item = point.get(n);
			System.out.printf("%.2f\n%.2f\n", tresure[item - 1][0], tresure[item - 1][1]);
		}
	}

	private static int parseNum() {
		int		num   = -1;
		String	strIn = null;

		if ((strIn = parseStdin()) != null) {
			num = Integer.parseInt(strIn);
		}
		
		return num;
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