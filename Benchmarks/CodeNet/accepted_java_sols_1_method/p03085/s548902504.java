import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('A', 'T');
		map.put('C', 'G');
		map.put('G', 'C');
		map.put('T', 'A');
		System.out.println(map.get(sc.next().charAt(0)));
	}

}
