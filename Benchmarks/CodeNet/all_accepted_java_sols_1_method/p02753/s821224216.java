import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String word = s.next();
		if(word.contains("A") && word.contains("B")) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
