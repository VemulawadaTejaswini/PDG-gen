import java.util.*;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String s = sc.next();
		String t = sc.next();
		int len = s.length();
		int count = 0;

		for(int i = 0; i < len; i++) {
			char a = s.charAt(i);
			char b = t.charAt(i);
			if(a != b) {
				count++;
			}
		}
		System.out.println(count);
    }
}