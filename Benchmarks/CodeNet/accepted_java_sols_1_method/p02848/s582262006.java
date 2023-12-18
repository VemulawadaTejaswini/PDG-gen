import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
 		Scanner scanner = new Scanner(System.in);
 		List<String> abc = new ArrayList<String>();
 		int x = 0;
 		int N = scanner.nextInt();
 		String S = scanner.next();
 		String[] splitArray = S.split("");
 		String str[] = new String[splitArray.length];
 		
 		abc.add("A");
 		abc.add("B");
 		abc.add("C");
 		abc.add("D");
 		abc.add("E");
 		abc.add("F");
 		abc.add("G");
 		abc.add("H");
 		abc.add("I");
 		abc.add("J");
 		abc.add("K");
 		abc.add("L");
 		abc.add("M");
 		abc.add("N");
 		abc.add("O");
 		abc.add("P");
 		abc.add("Q");
 		abc.add("R");
 		abc.add("S");
 		abc.add("T");
 		abc.add("U");
 		abc.add("V");
 		abc.add("W");
 		abc.add("X");
 		abc.add("Y");
 		abc.add("Z");
		 
		for (int i = 0; i < splitArray.length; i++) {
			//System.out.println(splitArray[i]);
		}
		
		for (int i = 0; i < splitArray.length; i++) {
			x = abc.indexOf(splitArray[i]) + N;
			if (x >= 26) {
				x -= 26;
			}
			//System.out.println(x);
			System.out.print(abc.get(x));
		}
	}
}
