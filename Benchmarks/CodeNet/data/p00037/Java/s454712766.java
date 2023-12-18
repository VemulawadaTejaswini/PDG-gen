import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {
	private	static	final	int					DIRECT_NONE  = 0;
	private	static	final	int					DIRECT_UP    = 1;
	private	static	final	int					DIRECT_DOWN  = 2;
	private	static	final	int					DIRECT_LEFT  = 4;
	private	static	final	int					DIRECT_RIGHT = 8;

	private	static			BufferedReader		stdin = null;
	private	static			ArrayList<String>	plist = null;
	private	static			ArrayList<Integer>	dlist = null;

	static {
		stdin = new BufferedReader(new InputStreamReader(System.in));
		plist = new ArrayList<String>();
		dlist = new ArrayList<Integer>();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[][]	map = null;

		while ((map = parseMap()) != null) {
			traceRoute(map);
		}
	}

	private static void traceRoute(byte[][] map) {
		int nX    = 0;
		int nY    = 0;
		int	nDir  = DIRECT_RIGHT;
		int	nStop = -1;

		while (true) {
			int bit = map[nY][nX];

			if ((bit & nDir) == 0) {
				if ((bit & DIRECT_UP) != 0 && nDir != DIRECT_DOWN) {
					nDir = DIRECT_UP;
				}
				else if ((bit & DIRECT_DOWN) != 0 && nDir != DIRECT_UP) {
					nDir = DIRECT_DOWN;
				}
				else if ((bit & DIRECT_LEFT) != 0 && nDir != DIRECT_RIGHT) {
					nDir = DIRECT_LEFT;
				}
				else if ((bit & DIRECT_RIGHT) != 0 && nDir != DIRECT_LEFT) {
					nDir = DIRECT_RIGHT;
				}
				else {
					nDir = DIRECT_NONE;
				}
			}

			if (nDir == DIRECT_NONE) {
				nStop = plist.size();
				break;
			}
			else {
				String	pitem  = String.format("%d %d", nX, nY);
				int		nIndex = plist.indexOf(pitem);

				if (nIndex != -1) {
					nStop = nIndex;
					break;
				}

				plist.add(pitem);
				dlist.add(nDir);

				switch (nDir) {
				case DIRECT_UP:
					nY--;
					break;
				case DIRECT_DOWN:
					nY++;
					break;
				case DIRECT_LEFT:
					nX--;
					break;
				case DIRECT_RIGHT:
					nX++;
					break;
				}
			}
		}

		for(int n = 0; n < dlist.size(); n++) {
			switch (dlist.get(n)) {
			case DIRECT_UP:
				System.out.print("U");
				break;
			case DIRECT_DOWN:
				System.out.print("D");
				break;
			case DIRECT_LEFT:
				System.out.print("L");
				break;
			case DIRECT_RIGHT:
				System.out.print("R");
				break;
			}
		}

		for(int n = nStop - 1; n >= 0; n--) {
			switch (dlist.get(n)) {
			case DIRECT_UP:
				System.out.print("D");
				break;
			case DIRECT_DOWN:
				System.out.print("U");
				break;
			case DIRECT_LEFT:
				System.out.print("R");
				break;
			case DIRECT_RIGHT:
				System.out.print("L");
				break;
			}
		}
		System.out.println("");
	}

	private static byte[][] parseMap() {
		byte[][]	map   = null;
		String		line  = null;
		int			n1    = 0;

		for (; ; n1++) {
			line = parseStdin();
			if (line == null) {
				break;
			}

			if (n1 == 0) {
				map = new byte[5][5];
			}

			switch((n1 % 2)) {
			case 0:
				{
					for(int n2 = 0; n2 < line.length(); n2++) {
						if (line.charAt(n2) == '1') {
							map[n1 / 2][n2]     |= DIRECT_RIGHT;
							map[n1 / 2][n2 + 1] |= DIRECT_LEFT;
						}
					}
					break;
				}
			case 1:
				{
					for(int n2 = 0; n2 < line.length(); n2++) {
						if (line.charAt(n2) == '1') {
							map[n1 / 2][n2]     |= DIRECT_DOWN;
							map[n1 / 2 + 1][n2] |= DIRECT_UP;
						}
					}
					break;
				}
			}
		}

		return map;
	}

	private static String parseStdin() {
		String	strNum = null;

		try {
			String line = stdin.readLine();
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