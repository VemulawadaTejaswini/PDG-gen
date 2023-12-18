import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNext()) {
			String str = scan.next();
			
			if (str.equals("-"))
				break;
			
			int numShuffle = scan.nextInt(); // シャッフルする回数
			for (int i=0; i<numShuffle; i++) {
				int changeLength = scan.nextInt();
				str = str.substring(changeLength, str.length()) + str.substring(0, changeLength);
			}
			System.out.println(str);
		}
				
	}
}