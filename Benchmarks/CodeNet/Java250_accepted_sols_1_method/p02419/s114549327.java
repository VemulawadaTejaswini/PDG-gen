

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String sentence = "";
		String word = in.next();
		int count = 0;

		while(!(sentence.equals("END_OF_TEXT"))){

			sentence = in.next();

			if(word.equalsIgnoreCase(sentence)){

				count ++;

			}
		}

		System.out.println(count);

	}
}