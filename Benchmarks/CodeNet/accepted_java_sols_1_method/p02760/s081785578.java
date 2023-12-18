import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
	for (int i=0; i<3; i++)
	    for (int j=0; j<3; j++)
		a[i][j] = sc.nextInt();
	int n = sc.nextInt();
	int b;
	boolean[][] is = new boolean[3][3];
	for (int k=0; k<n; k++) {
	    b = sc.nextInt();
	    for (int i=0; i<3; i++) {
		for (int j=0; j<3; j++) {
		    if (a[i][j] == b) {
			is[i][j] = true;
			break;
		    }
		}
	    }
	}
	boolean result = false;
	if (is[1][1]) {
	    if ((is[0][0] && is[2][2]) || (is[0][1] && is[2][1])
		|| (is[0][2] && is[2][0]) || (is[1][0] && is[1][2])) {
		result = true;
	    }
	} else {
	    if ((is[0][0] && is[0][1] && is[0][2]) ||
		(is[0][0] && is[1][0] && is[2][0]) ||
		(is[0][2] && is[1][2] && is[2][2]) ||
		(is[2][0] && is[2][1] && is[2][2])) {
		result = true;
	    }
	}
	System.out.print(result ? "Yes" : "No");
    }
}
