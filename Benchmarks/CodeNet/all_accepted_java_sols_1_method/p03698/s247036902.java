import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int dec = 0;
		for(int i = 0;i<s.length();i++) {
			for(int k = i+1;k<s.length();k++) {
				if(s.charAt(i) == s.charAt(k)) {
					dec = 1;
					break;
				}
			}
		}
		if(dec == 1) {
			System.out.println("no");
		}else {
			System.out.println("yes");
		}
	}

}