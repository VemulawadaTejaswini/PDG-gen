import java.util.*;
//import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		sc.close();
		StringBuilder ans = new StringBuilder();
		for(i=0;i<n.length();i++) {
			switch(n.charAt(i)) {
			case '1':
				ans.append("9");
				break;
			case '9':
				ans.append("1");
				break;
			default:
				ans.append(n.charAt(i));
				break;
			}
		}
		System.out.println(ans);
	}
}
