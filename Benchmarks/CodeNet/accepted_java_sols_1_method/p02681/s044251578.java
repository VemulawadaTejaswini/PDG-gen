import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		boolean check = true;
		for(int i=0;i<s.length();i++) {
			if(!(s.charAt(i)==t.charAt(i))) {
				check = false;
				break;
			}
		}
		if(check && t.length()==s.length()+1) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}