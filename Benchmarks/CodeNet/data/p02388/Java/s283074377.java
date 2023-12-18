import java.io.Console;
class Main {
	public static void main(String[] args) {
		Console console = System.console();

		int hen = Integer.parseInt(console.readLine());
		int kai = 1;
		for(int i = 0;i < 3;i++) {
			kai = kai * hen;
		}
		System.out.println(kai);
	}
}