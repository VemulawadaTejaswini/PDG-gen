import java.util.*;
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		for(int i = 97; i<=97+25; i++) {
			char c = (char) i;
			
			for(int j = 0; j<s.length(); j++) {
				if(s.charAt(j) == c) {
					break;
				}
				if(j == s.length()-1) {
					System.out.println(c);
					System.exit(0);
				}
			}
			
		}
		
		System.out.println("None");
	}

}
