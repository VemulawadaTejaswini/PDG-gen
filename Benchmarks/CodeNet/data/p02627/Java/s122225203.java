import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args){
		// input
		Scanner inData = new Scanner(System.in);

		String line = inData.nextLine();
		String regex = "[a-z]";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(line);

		if (m.find()) {
			System.out.println("a");
		} else {
			System.out.println("A");
		}

		inData.close();
	}
}
