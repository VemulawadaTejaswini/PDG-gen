import java.io.Console;

public class Main {
	public static void main(String[] args) {
		Console console = System.console();

		int hen = Integer.parseInt(args[0]);
		int kai = 1;
		for(int i = 0;i < 3;i++) {
			kai = kai * hen;
		}
		System.out.println(kai);
	}
}