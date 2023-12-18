import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int[][] tiles = new int[10][10];

	while (sc.hasNextLine()) {
	    String[] input = sc.nextLine().split(",");

	    if ("".equals(input[0])) {
		break;
	    }
	    int x = Integer.parseInt(input[0]);
	    int y = Integer.parseInt(input[1]);
	    int size = Integer.parseInt(input[2]);

	    if (1 == size) {
		for (int i = -1; i < 2; i++) {
		    if (i == 0) {
			if (compBet(y - 1)) {
			    tiles[x][y - 1]++;
			}

			if (compBet(y + 1)) {
			    tiles[x][y + 1]++;
			}
		    }

		    if (compBet(x + i)) {
			tiles[x + i][y]++;
		    }

		}
	    }

	    if (2 == size) {
		for (int i = -1; i < 2; i++) {
		    for (int j = -1; j < 2; j++) {
			if (compBet(x + i) && compBet(y + j)) {
			    tiles[x + i][y + j]++;
			}
		    }
		}
	    }

	    if (3 == size) {
		for (int i = -1; i < 2; i++) {
		    for (int j = -1; j < 2; j++) {
			if (compBet(x + i) && compBet(y + j)) {
			    tiles[x + i][y + j]++;
			}
		    }
		}
		if (compBet(x - 2)) {
		    tiles[x - 2][y]++;
		}

		if (compBet(x + 2)) {
		    tiles[x + 2][y]++;
		}

		if (compBet(y - 2)) {
		    tiles[x][y - 2]++;
		}

		if (compBet(y + 2)) {
		    tiles[x][y + 2]++;
		}

	    }

	}
	System.out.println(countZero(tiles));
	System.out.println(countMax(tiles));

    }

    private static boolean compBet(int xPlusI) {
	if (xPlusI <= -1) {
	    return false;
	}

	if (xPlusI >= 10) {
	    return false;
	}

	return true;
    }

    private static int countMax(int[][] tiles) {
	int max = 0;

	for (int[] yLine : tiles) {
	    for (int tile : yLine) {
		max = Math.max(max, tile);
	    }
	}
	return max;
    }

    private static int countZero(int[][] tiles) {
	int blankCount = 0;

	for (int[] yLine : tiles) {
	    for (int tile : yLine) {
		if (tile == 0) {
		    blankCount++;
		}
	    }
	}

	return blankCount;
    }
}