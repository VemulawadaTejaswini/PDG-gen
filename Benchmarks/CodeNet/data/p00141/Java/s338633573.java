import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
 
 
public class Main {
	private static  BufferedReader  br = null;

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	* @param args
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt = parseCnt();
		for (int i = 0; i < cnt; i++) {
			if (i != 0) {
				System.out.println();
			}
			parseSpiral();
		}
	}

	private static void parseSpiral() {
		int	len = parseCnt();
		if (len > 0) {
			char[][]	map = new char[len][len];

			if (len == 1) {
				map[0][0] = '#';
			} else {
				for (int i = 0, j = len-1; i <= j; i++,j--) {
					if (i%2 == 0) {
						if (i==0) {
							Arrays.fill(map[i], '#');
						} else {
							map[i] = map[j+2].clone();
							map[i][j+1] = ' ';
						}

						if (i != j) {
							map[j] = map[i].clone();
							map[j][i+1] = ' ';
						}
					} else {
						if (i==1) {
							map[i][0] ='#';
							map[i][j+1] ='#';
						} else {
							map[i] = map[j+2].clone();
							map[i][j+1] = '#';
						}

						if (i != j) {
							map[j] = map[i].clone();
							if (i+1 != j) {
								map[j][i+1] = '#';
							}
						}
					}
				}
			}

			for (int i = 0; i < map.length; i++) {
				System.out.println(map[i]);
			}
		}
	}

	private static int parseCnt() {
		int     cnt = 0;
		String  str = null;

		if ((str = parseStdin()) != null) {
			cnt = Integer.parseInt(str);
		}

		return cnt;
	}

	private static String parseStdin() {
		String	stdin = null;

		try {
			String	tmp = br.readLine();
			if (tmp != null) {
				if (!tmp.isEmpty()) stdin = tmp;
				}
			}
		catch (IOException e) {}

		return stdin;
	}
}