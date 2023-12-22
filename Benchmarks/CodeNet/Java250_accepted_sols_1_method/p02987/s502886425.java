import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] ch = str.toCharArray();
		ArrayList<Character> check = new ArrayList<>();
		
		for(int i = 0; i < 4; i++) {
			if(!check.contains(ch[i])) {
				check.add(ch[i]);
			}
		}
		if(check.size() == 2) System.out.println("Yes");
		else System.out.println("No");
	}
}