import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
    static int[][] paper;
    public static void main (String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	paper = new int[10][10];
	int x, y;
	String size, str;
	String[] input;
	while ((str = br.readLine()) != null) {
	    input = str.split(",");
	    x = Integer.parseInt(input[0]);
	    y = Integer.parseInt(input[1]);
	    size = input[2];
	    dropInk(x, y);
	    smallInk(x, y);
	    if (size.equals("1")) {
		continue;
	    }
	    mediumInk(x, y);
	    if (size.equals("2")) {
		continue;
	    }
	    largeInk(x, y);
	}
	int max = 0, cnt = 0;
	for (int i = 0; i < 10; i++) {
	    for (int j = 0; j < 10; j++) {
		if (paper[i][j] == 0) {
		    cnt++;
		}
		if (paper[i][j] > max) {
		    max = paper[i][j];
		}
	    }
	}
	System.out.println(cnt);
	System.out.println(max);
    }
    public static void dropInk (int x, int y) {
	if ((0 <= x && x < 10) && (0 <= y && y < 10)) {
	    paper[x][y]++;
	}
    }
    public static void smallInk (int x, int y) {
	dropInk(x+1, y);
	dropInk(x-1, y);
	dropInk(x, y+1);
	dropInk(x, y-1);	
    }
    public static void mediumInk (int x, int y) {
	dropInk(x+1, y+1);
	dropInk(x-1, y+1);
	dropInk(x+1, y-1);
	dropInk(x-1, y-1);
    }
    public static void largeInk (int x, int y) {
	dropInk(x+2, y);
	dropInk(x-2, y);
	dropInk(x, y+2);
	dropInk(x, y-2);
    }
}