import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
	int n;
	while ((n = nextInt()) != 0) {
	    int[][] map = new int[21][21];
	    for (int i = 0; i < n; i++) {
		map[nextInt()][nextInt()] = 1;

	    }
	    int m = nextInt();
	    int x = 10;
	    int y = 10;
	    int count = 0;
	    for (int i = 0; i < m; i++) {
		// if (count != n) {
		char c = getChar();
		int l = nextInt();
		int dx = 0;
		int dy = 0;
		if (c == 'N') {
		    dy = 1;
		} else if (c == 'E') {
		    dx = 1;
		} else if (c == 'S') {
		    dy = -1;
		} else if (c == 'W') {
		    dx = -1;
		}
		for (int j = 0; j < l; j++) {
		    count += map[x][y];
		    map[x][y] = 0;
		    x += dx;
		    y += dy;
		}
		count += map[x][y];
		map[x][y] = 0;
		// } else {
		// skip();
		// }
	    }
	    if (count == n) {
		System.out.println("Yes");
	    } else {
		System.out.println("No");
	    }
	}
    }

    private static void skip() throws IOException {
	int c = System.in.read();
	while (c != '\n') {
	    c = System.in.read();
	}

    }

    private static char getChar() throws IOException {
	int c = ' ';
	while (c < 'E' || 'W' < c) {
	    c = System.in.read();
	}
	return (char) c;
    }

    private static int nextInt() throws IOException {
	int c = System.in.read();
	while ((c < '0' || '9' < c) && c != '-') {
	    c = System.in.read();
	}
	if (c == '-') {
	    return -nextInt();
	}
	int result = 0;
	while ('0' <= c && c <= '9') {
	    result = result * 10 + (c - '0');
	    c = System.in.read();
	}
	return result;
    }
}