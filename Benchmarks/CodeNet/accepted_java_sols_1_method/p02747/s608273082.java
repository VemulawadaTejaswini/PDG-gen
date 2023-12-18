import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		String s = stdIn.next();
		if(s.length() % 2 != 0) {
			System.out.println("No");
			return;
		}
		
		String a = "hi";
		
		for(int i = 0; i < s.length()-1; i+=2) {
			if(!s.substring(i,i+2).equals(a)) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
		
		
		
	}

}
