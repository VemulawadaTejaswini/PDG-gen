import java.util.*;

public class Main {
    public static void main (String [] args) {
	Scanner in = new Scanner(System.in);

	while (true) {
	    int m = in.nextInt();
	    int f = in.nextInt();
	    int r = in.nextInt();

	    if (m == -1 && f == -1 && r == -1) {
		break;
	    }
	    solve(m,f,r);
	}
    }

    public static void solve (int m,int f,int r) {
	int test = m + f;
	
	if (test >= 80) {
	    System.out.println("A");
	} else if (test >= 65) {
	    System.out.println("B");
	} else if (test >= 50) {
	    System.out.println("C");
	} else if (test >= 30) {
	    if (r >= 50) {
		System.out.println("C");
	    } else {
		System.out.println("D");
	    }
	} else {
	    System.out.println("F");
	}
    }
}