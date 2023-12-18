import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Map<String,String> Alpha = new HashMap<>();

		Alpha.put("a","b");
		Alpha.put("b","c");
		Alpha.put("c","d");
		Alpha.put("d","e");
		Alpha.put("e","f");
		Alpha.put("f","g");
		Alpha.put("g","h");
		Alpha.put("h","i");
		Alpha.put("i","j");
		Alpha.put("j","k");
		Alpha.put("k","l");
		Alpha.put("l","m");
		Alpha.put("m","n");
		Alpha.put("n","o");
		Alpha.put("o","p");
		Alpha.put("p","q");
		Alpha.put("q","r");
		Alpha.put("r","s");
		Alpha.put("s","t");
		Alpha.put("t","u");
		Alpha.put("u","v");
		Alpha.put("v","w");
		Alpha.put("w","x");
		Alpha.put("x","y");
		Alpha.put("y","z");

		System.out.print(Alpha.get(sc.next()));

		sc.close();
	}
}
