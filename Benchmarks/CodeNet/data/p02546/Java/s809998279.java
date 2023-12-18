import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String s = in.next();
		
		if(s.endsWith("s")) {
			System.out.println(s+""+"es");
		}
		else {
			System.out.println(s+""+"s");
		}

	}

}
