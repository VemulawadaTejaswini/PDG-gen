import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		int strLength = scan.nextInt();
		if(strLength % 2 == 0) {
			String strInput  = scan.next(); 				
			String result = strInput.subSequence(0, (strLength/2)).equals(strInput.substring((strLength/2), strLength)) ? "Yes" : "No";
			System.out.println(result);
		}
		else {
			System.out.println("No");
		}
			
	}
}
