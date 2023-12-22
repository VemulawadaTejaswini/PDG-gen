import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String t = scan.next();
		int len = s.length();
		boolean ok = true;
		for(int i = 0;i < len; ++i){
			if(s.charAt(i) != t.charAt(i))ok = false;
		}
		System.out.print(ok ? "Yes":"No");
	}
}

