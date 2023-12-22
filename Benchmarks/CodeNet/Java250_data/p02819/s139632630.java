import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	int result = 0;;
	boolean is = true;
	if (x == 2 || x == 3) {
	    is = false;
	    result = x;
	    System.out.print(result);
	}
	while (is) {
	    if (x % 2 != 0) {
		for (int i=3; i<x; i++) {
		    if (x % i == 0) {
			break;
		    }
		    if (i == x-1) {
			is = false;
			result = x;
			System.out.print(result);
			is = false;
		    }
		}
	    }
	    x++;
	}
    }
}
