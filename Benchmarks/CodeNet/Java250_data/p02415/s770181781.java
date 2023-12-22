import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//sc.useDelimiter("\n");

		String strBefore = new String(sc.nextLine());
		//String strBefore = new String("fAIR, LATER, OCCASIONALLY CLOUDY.");
		
		ArrayList<String> charBefore = new ArrayList<>();
		ArrayList<String> charAfter = new ArrayList<>();
		
		for(int i = 0; i < strBefore.length(); i++) {
			charBefore.add(strBefore.substring(i, i + 1));
			charAfter.add(charBefore.get(i).toUpperCase());
			if(charBefore.get(i).equals(charAfter.get(i))) {
				charAfter.set(i, charBefore.get(i).toLowerCase());
			}
			System.out.print(charAfter.get(i));
		}
		System.out.println();
	}
}