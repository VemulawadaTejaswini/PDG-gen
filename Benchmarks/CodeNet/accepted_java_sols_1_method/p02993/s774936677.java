import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		String a = "Good";
		for(i=1;i<s.length();i++) {
			if(s.charAt(i-1)==s.charAt(i)) {
				a = "Bad";
				break;
			}
		}
		System.out.println(a);
	}
}
