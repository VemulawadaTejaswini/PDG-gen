import java.util.*;
public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
 
        String s = sc.next();
		String ans = "";
		for (int i = 0; i < s.length(); i++) {
			char key = s.charAt(i);
			if (key=='B') {
				int rightmost = ans.length() - 1;
				if (rightmost<=0) {
					ans = "";
				} else {
					ans = ans.substring(0, rightmost);
				}
			} else{
				ans += key;
			}
		}
		System.out.println(ans);
	}
}