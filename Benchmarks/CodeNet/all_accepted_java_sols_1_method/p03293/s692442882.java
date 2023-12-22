import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		
		boolean flag = false;
		for(int i = 0; i < s.length(); i++) {
			if (s.equals(t)){
				flag = true;
				break;
			}
			Character c = s.charAt(0);
			s = s.substring(1, s.length()) + c;
		}
		
		if(flag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
