import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
	public static void main(String[] args) {
         
      try (Scanner scan = new Scanner(System.in)) {
        String input = scan.next();
        Pattern p = Pattern.compile("[ATGC]+");
	Matcher m = p.matcher(input);
	int maxlength = 0;
	while (m.find()) {
		if (m.group().length() > maxlength) {
			maxlength = m.group().length();
		}
	}
      System.out.println(maxlength);  
    }
    }
}