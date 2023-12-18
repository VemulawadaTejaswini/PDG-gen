import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		String tpp = stdin.nextLine();
		Pattern p = Pattern.compile("[,.\\s]");
		String[] result = p.split(tpp);
		for (int i=0; i<result.length; i++){
			if(result[i].length() > 2 && result[i].length() < 7)
			System.out.print(result[i] + " ");

		}
		System.out.println("");
	}


}