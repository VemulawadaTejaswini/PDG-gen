import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {
	private	final	static	int				LARGE  = 3;
	private	final	static	int				MIDDLE = 2;
	private	final	static	int				SMALL  = 1;
	private	final	static	int				SIZE   = 10;
	private			static	BufferedReader	br     = null;
	private			static	int[][]			map    = new int[SIZE][SIZE];
	private			static	int				drop   = 0;

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}
 
    /**
     * @param args
     */
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		int					cnt = 0;
		ArrayList<int[]>	ans = new ArrayList<int[]>();

		while ((cnt = parsePoint()) != 0) {
			ans.clear();

//			parseMap();

//			solve(ans, cnt);

//			for (int loop = 0; loop < ans.size(); loop++) {
//				int[]	item = ans.get(loop);
//				System.out.println(item[0] + " " + item[1] + " " + item[2]); 
//			}
		}
	}
 
	private static boolean isFinish(ArrayList<int[]> ans, int cnt) {
		return (drop == 0 && cnt == ans.size());
	}

	private static void solve(ArrayList<int[]> ans, int cnt) {
		if (isFinish(ans, cnt)) {
			return;
		}

		for(int y = 0; y < SIZE; y++) {
			for(int x = 0; x < SIZE; x++) {
				if (map[y][x] > 0) {
					boolean	isMatch = false;

					// Large Drop
					if (isMatchLarge(x, y)) {
						int item[] = {x, y+2, LARGE};
						isMatch = true;
						putLarge(x, y, true);
						ans.add(item);
						drop -= 13;
						solve(ans, cnt);
						if (isFinish(ans, cnt)) {
							return;
						}
						drop += 13;
						ans.remove(item);
						putLarge(x, y, false);
					}
					
					// Middle Drop
					if (isMatchMiddle(x, y)) {
						int item[] = {x+1, y+1, MIDDLE};
						isMatch = true;
						putMiddle(x, y, true);
						ans.add(item);
						drop -= 9;
						solve(ans, cnt);
						if (isFinish(ans, cnt)) {
							return;
						}
						drop += 9;
						ans.remove(item);
						putMiddle(x, y, false);
					}

					// Small Drop
					if (isMatchSmall(x, y)) {
						int item[] = {x, y+1, SMALL};
						isMatch = true;
						putSmall(x, y, true);
						ans.add(item);
						drop -= 5;
						solve(ans, cnt);
						if (isFinish(ans, cnt)) {
							return;
						}
						drop += 5;
						ans.remove(item);
						putSmall(x, y, false);
					}

					if (!isMatch) {
						return;
					}
				}
			}
		}
	}

	private static boolean isMatchSmall(int x, int y) {
		boolean bStatus = false;

		if (1 <= x && x <= 8 && y <= 7) {
			bStatus = (map[y][x] > 0)
			        & (map[y+1][x-1] > 0)
			        & (map[y+1][x] > 0)
			        & (map[y+1][x+1] > 0)
			        & (map[y+2][x] > 0);
		}

		return bStatus;
	}

	private static void putSmall(int x, int y, boolean rm) {
		int val = (!rm) ? 1 : -1;
		map[y][x] += val;
		map[y+1][x-1] += val;
		map[y+1][x] += val;
		map[y+1][x+1] += val;
		map[y+2][x] += val;
	}

	private static boolean isMatchMiddle(int x, int y) {
		boolean bStatus = false;

		if (x <= 7 && y <= 7) {
			bStatus = (map[y][x] > 0)
			        & (map[y][x+1] > 0)
			        & (map[y][x+2] > 0)
			        & (map[y+1][x] > 0)
			        & (map[y+1][x+1] > 0)
			        & (map[y+1][x+2] > 0)
			        & (map[y+2][x] > 0)
			        & (map[y+2][x+1] > 0)
			        & (map[y+2][x+2] > 0);
		}

		return bStatus;
	}

	private static void putMiddle(int x, int y, boolean rm) {
		int val = (!rm) ? 1 : -1;
		map[y][x]     += val;
		map[y][x+1]   += val;
		map[y][x+2]   += val;
		map[y+1][x]   += val;
		map[y+1][x+1] += val;
		map[y+1][x+2] += val;
		map[y+2][x]   += val;
		map[y+2][x+1] += val;
		map[y+2][x+2] += val;
	}

	private static boolean isMatchLarge(int x, int y) {
		boolean bStatus = false;

		if (2 <= x && x <= 7 && y <= 5) {
			bStatus = (map[y][x] > 0)
			        & (map[y+2][x-2] > 0)
			        & (map[y+2][x+2] > 0)
			        & (map[y+4][x] > 0)
			        & isMatchMiddle(x-1, y+1);
		}

		return bStatus;
	}

	private static void putLarge(int x, int y, boolean rm) {
		int val = (!rm) ? 1 : -1;
		map[y][x]     += val;
		map[y+2][x-2] += val;
		map[y+2][x+2] += val;
		map[y+4][x]   += val;
		putMiddle(x-1, y+1, rm);
	}

	private static int parsePoint() {
		int	params = 0;
        String	strin  = null;

        if ((strin = parseStdin()) != null) {
        	params = Integer.parseInt(strin);
        }
 
        return params;
	}

	private static void parseMap() {
		drop = 0;
		for (int loop1 = 0; loop1 < SIZE; loop1++) {
			String	strin  = null;
	        if ((strin = parseStdin()) != null) {
	        	String[]	lines = strin.split(" ");

	        	for (int loop2 = 0; loop2 < SIZE; loop2++) {
	        		map[loop1][loop2]  = Integer.parseInt(lines[loop2]);
	        		drop              += map[loop1][loop2];
	        	}
	        }
		}
	}

	private static String parseStdin() {
        String  stdin = null;
        
        try {
        	String  tmp = br.readLine();
        	if (!tmp.isEmpty()) stdin = tmp;
        }
        catch (IOException e) {}
 
        return stdin;
	}
}