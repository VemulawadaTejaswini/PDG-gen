import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] words;
		int intCount = 0;
		String strWord = scan.nextLine();
		String strIn = "";
		while(true) {
			strIn = scan.nextLine();
			if(strIn.equals("END_OF_TEXT")){
				break;
			}
			words = strIn.toLowerCase().split(" ");
			for (int j = 0; j < words.length; j++) {
				if(words[j].equals(strWord)){
					intCount++;
				}
			}
		}
		System.out.println(intCount);
		scan.close();
	}
}