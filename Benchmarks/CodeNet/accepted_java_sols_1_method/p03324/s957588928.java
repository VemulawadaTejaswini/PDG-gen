import java.util.*;

class Main {
    public static void main(String args[]) {
	Scanner scan = new Scanner(System.in);
	int d = scan.nextInt();
	int n = scan.nextInt();
	int anser = (int)Math.pow(100, d) * n;
	if (anser ==  Math.pow(100, d) * 100) {
	    System.out.println(anser + (int)Math.pow(100, d));
	} else {
	    System.out.println(anser);
	}
    }
}
