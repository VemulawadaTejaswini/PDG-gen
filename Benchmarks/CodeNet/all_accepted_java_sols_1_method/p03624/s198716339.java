import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
		String s = sc.nextLine();
		sc.close();
		Set<Character> list = new HashSet<>();
		for(int i = 0; i < s.length(); i++){
			list.add(s.charAt(i));
		  }
		for (char i='a';i<='z';i++) {
			if(!list.contains(i)) {
				System.out.println(i);
				return;
			}
		}
		System.out.println("None");
		
		//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
	}
}