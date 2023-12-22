import java.util.*;

public class Main {
    public static void main (String [] args) {
	Scanner in = new Scanner(System.in);

	String word = in.next();
	int count = 0;

	word = word.toLowerCase();

	while (true) {
	    String str = in.next();

	    if (str.equals("END_OF_TEXT")) {
		break;
	    }

	    str = str.toLowerCase();
	    if (str.equals(word)) {
		count++;
	    }
	}
        System.out.println(count);
    }
}