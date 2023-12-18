import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s  = sc.next();
		if(s.length() == 3) {
			String s1 = "";
			for(int i = 2;i >= 0;i --) {
				s1 += s.charAt(i);
			}
			System.out.println(s1);
			return;
		}
		System.out.println(s);
	}
}