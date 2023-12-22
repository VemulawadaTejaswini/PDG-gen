import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s =sc.next();
		char b = s.charAt(0);
		int c = 1;
		for(int i = 1;i < n;i++) {
			if(b != s.charAt(i)) {
				b = s.charAt(i);
				c++;
			}
		}
		System.out.println(c);
	}

}
