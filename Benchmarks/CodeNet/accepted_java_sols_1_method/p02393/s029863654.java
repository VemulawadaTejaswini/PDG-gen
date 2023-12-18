import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = null;
	int[] num = new int[3];
	try {
	    scan = new Scanner(System.in);
	    for (int i = 0; i < num.length; i++) {
		num[i] = scan.nextInt();
	    }
	    Arrays.sort(num);
	    StringBuffer sortlist = new StringBuffer();
		for (int i = 0; i < num.length; i++) {
		    sortlist.append(num[i]);
		    if (i < num.length - 1) {
			sortlist.append(" ");
		    }
		}
	    System.out.println(sortlist);
	} catch (InputMismatchException e) {
	    System.out.println(e);
	} finally {
	    scan.close();
	}
    }
}