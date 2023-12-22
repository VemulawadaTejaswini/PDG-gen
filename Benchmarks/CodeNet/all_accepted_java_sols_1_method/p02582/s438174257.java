
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		int count = 1;
		int sunny = 0;
		for(int i = 0; i < s.length(); i++) {
			if(i > 0 && s.charAt(i - 1) == 'R' && s.charAt(i) == 'R') {
				count++;
			}
			
			if(s.charAt(i) == 'S') {
				sunny++;
			}
		}
		
		if(sunny == s.length()) {
			count = 0;
		}
		System.out.println(count);
	}

}
