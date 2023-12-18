import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean j = true;

		String s = sc.next();

		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(i % 2 == 0){
				if(c != 'R' && c != 'U' && c != 'D') {
					j = false;
					break;
				}
			} else {
				if(c != 'L' && c != 'U' && c != 'D') {
					j = false;
					break;
				}
			}
		}

		System.out.println(j ? "Yes" : "No");
	}
}