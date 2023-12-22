import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		char[] s = stdIn.next().toCharArray();
		
		if(s[0]==s[1] || s[1] == s[2] || s[2]==s[3]) {
			System.out.println("Bad");
		}else {
			System.out.println("Good");
		}
		
		
	}

}
