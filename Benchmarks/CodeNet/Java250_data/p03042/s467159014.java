import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

	public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();

    String mae = S.substring(0, 2);
    String ato = S.substring(2, 4);

    boolean maet = false;
    boolean atot = false;

    Pattern nump = Pattern.compile("[0-9]{2}");
    if (nump.matcher(mae).find() && nump.matcher(ato).find()) {
    	// YYMMorMMYYどちらか
    	if (mae.equals("01") || mae.equals("02") || mae.equals("03") || mae.equals("04") ||
    			mae.equals("05") || mae.equals("06") || mae.equals("07") || mae.equals("08") ||
    			mae.equals("09") || mae.equals("10") || mae.equals("11") || mae.equals("12")) {
    		maet = true;
    	}
    	if (ato.equals("01") || ato.equals("02") || ato.equals("03") || ato.equals("04") ||
    			ato.equals("05") || ato.equals("06") || ato.equals("07") || ato.equals("08") ||
    			ato.equals("09") || ato.equals("10") || ato.equals("11") || ato.equals("12")) {
    		atot = true;
    	}
    	if (maet && atot) {
    		System.out.println("AMBIGUOUS");
    	} else if (maet && !atot) {
    		System.out.println("MMYY");
    	} else if (!maet && atot) {
    		System.out.println("YYMM");
    	} else {
    		System.out.println("NA");
    	}
    } else {
    	// どちらでもない
    	System.out.println("NA");
    }

  }

}