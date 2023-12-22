import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean ans = true;
		for (int i = 0; i < s.length(); i=i+2) {
			char c = s.charAt(i);
			//System.out.println(c);
			if (c != 'R' && c != 'U' && c != 'D') {
				ans = false;
				break;
			}
		}
		for (int i = 1; i < s.length(); i=i+2) {
			char c = s.charAt(i);
			//System.out.println(c);
			if (c != 'L' && c != 'U' && c != 'D') {
				ans = false;
				break;
			}
		}
		if(ans) {
		System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
