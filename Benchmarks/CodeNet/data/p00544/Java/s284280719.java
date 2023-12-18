import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] counts = new int[h][3];
		for (int i = 0; i < h; i++) {
		    char[] arr = sc.next().toCharArray();
		    for (char c : arr) {
		        if (c == 'W') {
		            counts[i][0]++;
		        } else if (c == 'B') {
		            counts[i][1]++;
		        } else {
		            counts[i][2]++;
		        }
		    }
		}
		int min = Integer.MAX_VALUE;
		int white = 0;
		for (int i = 0; i < h - 2; i++) {
		    white += counts[i][1] + counts[i][2];
		    int blue = 0;
		    for (int j = i + 1; j < h - 1; j++) {
		        blue += counts[j][0] + counts[j][2];
		        int red = 0;
		        for (int k = j + 1; k < h; k++) {
		            red += counts[k][0] + counts[k][1];
		        }
		        min = Math.min(min, white + red + blue);
		    }
		}
		System.out.println(min);
	}
}

