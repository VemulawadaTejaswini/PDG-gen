import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
    static int[][] surface;
    public static void main (String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	surface = new int[8][8];
	String line;
	while ((line = br.readLine()) != null) {
	    for (int i = 0; i < 8; i++) {
		for (int j = 0; j < 8; j++) {
		    surface[i][j] = Integer.parseInt(line.substring(j, j+1));
		}
		line = br.readLine();
	    }
	    search();
	}
    }
    
    static int[] searchBlack () {
	int width = 0, height = 0;
	while (surface[height][width] == 0) {
	    width++;
	    if (width == 8) {
		width = 0;
		height++;
	    }
	}
	int[] data = {height, width};
	return data;
    }
    
    static int countBlack (int[] initialB) {
	int count = 0;
	int height = initialB[0];
	int width = initialB[1];
	while (surface[height][width] == 1) {
	    count++;
	    width++;
	}
	return count;
    }

    static void search () {
	int[] data = searchBlack();
	int height = data[0];
	int width = data[1];
	int count = countBlack(data);
	if (count == 1) {
	    if (isB(height, width)) {
		System.out.println("B");
	    } else if (isD(height, width)) {
		System.out.println("D");
	    } else if (isF(height, width)) {
		System.out.println("F");
	    }
	} else if (count == 2) {
	    int b = surface[height+1][width];
	    int c = surface[height+1][width+1];
	    if (b == 1 && c == 1) {
		System.out.println("A");
	    } else if (b == 0 && c == 1) {
		System.out.println("E");
	    } else if (b == 1 && c == 0) {
		System.out.println("G");
	    }
	} else if (count == 4) {
	    System.out.println("C");
	}
    }

    static boolean isB (int height, int width) {
	if (height + 4 > 7) {
	    return false;
	}
	if (surface[height+3][width] == 1) {
	    return true;
	} else {
	    return false;
	}
    }

    static boolean isD (int height, int width) {
	if (width == 0) {
	    return false;
	}
	if (surface[height+1][width-1] == 1) {
	    return true;
	} else {
	    return false;
	}
    }

    static boolean isF (int height, int width) {
	if (width == 7) {
	    return false;
	}
	if (surface[height+1][width+1] == 1) {
	    return true;
	} else {
	    return false;
	}
    }
}