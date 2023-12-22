import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Character> ans = new ArrayList<Character>();
		Scanner sc = new Scanner(System.in);
		String  s  = sc.next();
		char[]  _s = s.toCharArray();
		for(int i=0;i<_s.length;i++) 
			if(i % 2 == 0)	System.out.print(_s[i]);
		System.out.println("");
	}

}
