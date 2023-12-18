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
		int					max = 0;
		int					len = 0;
		int[]				num = null;
		int[][]				cnt = new int[331][10];
		ArrayList<int[]>	in  = new ArrayList<int[]>();

		while((num = parseNum()) != null) {
			max = Math.max(max, num[0]);
			in.add(num);
		}

		calc(0, 1, max, 0, cnt);

		len = in.size();
		for (int n = 0; n < len; n++) {
			num = in.get(n);
			if (num[1] <= cnt.length) {
				System.out.println(cnt[num[1]][num[0]-1]);
			} else {
				System.out.println(0);
			}
		}
	}

	private static void calc(int nBit, int trmc, int trmm, int sum, int[][] cnt) {
		for (int n = 0; n <= 9; n++) {
			if ((nBit & 1 << n) != 0) {
				continue;
			}

			cnt[sum + n * trmc][trmc-1]++;
			if (trmc < trmm) {
				// 最終項より前までの総和が指定した総和より小さい
				nBit |= 1 << n;
				calc(nBit, trmc + 1, trmm, sum + n * trmc, cnt);
				nBit &= ~(1 << n);
			}
		}
	}

	private static int[] parseNum() {
		int[]	num   = null;
		String	strIn = null;

		if ((strIn = parseStdin()) != null) {
			String[]	split = strIn.split(" ");
			num    = new int[2];
			num[0] = Integer.parseInt(split[0]); 
			num[1] = Integer.parseInt(split[1]); 
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