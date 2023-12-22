import java.util.Scanner;

import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Main {

	public static void main(String[] args) throws ScriptException {
		try (Scanner scanner = new Scanner(System.in)) {
			String s = scanner.nextLine();
			System.out.println((new ScriptEngineManager()).getEngineByName("JavaScript").eval(s));
		}
	}
}
