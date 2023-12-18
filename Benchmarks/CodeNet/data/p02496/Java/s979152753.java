import java.util.*;

public class Main {
    public static void main (String [] args) {
	Scanner in = new Scanner(System.in);

	boolean [][] cards = new boolean [4][13];
	int N = in.nextInt();

	for (int i = 0 ; i < N ; i++) {
	    String mark = in.next();
	    int num = in.nextInt();

	    if (mark.equals("S")) {
		cards[0][--num] = true;
	    } else if (mark.equals("H")) {
		cards[1][--num] = true;
	    } else if (mark.equals("C")) {
		cards[2][--num] = true;
	    } else {
		cards[3][--num] = true;
	    }
	}

	for (int i = 0 ; i < 4 ; i++) {
	    for (int j = 0 ; j < 13 ; j++) {
		if (!cards[i][j]) {
		    switch (i) {
		    case 0:
			System.out.println("S" + (j+1));
			break;
		    case 1:
			System.out.println("H" + (j+1));
			break;
		    case 2:
			System.out.println("C" + (j+1));
			break;
		    case 3:
			System.out.println("D" + (j+1));
			break;
		    }
		}
	    }
	}
    }
}