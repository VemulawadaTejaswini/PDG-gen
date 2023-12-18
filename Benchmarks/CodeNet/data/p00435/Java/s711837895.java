import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String changeWord="";
		char no = 3;
		String word = in.next();
		for(int i=0; i<word.length(); i++) {
		changeWord = changeWord + String.valueOf((char)(word.charAt(i)+no));
		}
		System.out.println(changeWord);
		}
	}