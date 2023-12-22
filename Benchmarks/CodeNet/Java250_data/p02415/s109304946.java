import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// ?????????????????\???
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		// ??\?????????????????????char????????????
		char [] sentence = input.toCharArray();

		for(int cnt=0; cnt< sentence.length; cnt++){

			if (Character.isUpperCase(sentence[cnt])){

				sentence[cnt] = Character.toLowerCase(sentence[cnt]);

			}else{

				sentence[cnt]=Character.toUpperCase(sentence[cnt]);

			}
		}

		sc.close();

		String output = String.valueOf(sentence);
		System.out.println(output);

	}
}