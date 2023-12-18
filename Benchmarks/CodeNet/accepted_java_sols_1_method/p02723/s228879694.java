import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner kbScanner = new Scanner(System.in);
		String input = kbScanner.next();
		if(input.charAt(2) == input.charAt(3) && input.charAt(4) == input.charAt(5)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		kbScanner.close();
	}

}
