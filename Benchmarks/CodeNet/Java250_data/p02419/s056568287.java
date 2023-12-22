import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		String w = sc.next().toLowerCase();
		int count = 0;

		String word = sc.next();
		for (; !word.equals("END_OF_TEXT"); word = sc.next()) {
//			System.out.println(word);
			if (w.equals(word.toLowerCase())) {
				count++;
			}
		}

		System.out.println(count);
		
		sc.close();
	}
}