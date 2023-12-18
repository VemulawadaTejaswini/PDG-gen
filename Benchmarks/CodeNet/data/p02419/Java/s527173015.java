import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	String w = scan.nextLine();
	int count = 0;
	while (scan.hasNext()) {
	    String T = scan.nextLine();
	    if (T.equals("END_OF_TEXT")) {
		break;
	    }
	    String[] Ts = T.split(" ");
	    for (int i = 0; i < Ts.length; i++) {
		if (Ts[i].equalsIgnoreCase(w)) {
		    count++;
		}
	    }
	}
	System.out.println(count);
    }
}