import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		sc.close();
		
		char ss = s.charAt(0);
		char ls = s.charAt(s.length()-1);
		int n = s.length()-2;
		
		System.out.print(ss);
		System.out.print(n);
		System.out.print(ls);

	}

}
