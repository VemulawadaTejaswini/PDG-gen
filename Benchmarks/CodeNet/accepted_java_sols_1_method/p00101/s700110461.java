import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Pattern pt = Pattern.compile("Hoshino");
		Matcher mc = pt.matcher("");
		in.nextLine();
		while (in.hasNextLine()) {
			mc.reset(in.nextLine());
			System.out.println(mc.replaceAll("Hoshina"));
		}
	}
}