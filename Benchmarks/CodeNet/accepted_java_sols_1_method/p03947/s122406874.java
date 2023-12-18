import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		String S=in.next();
		int condition =0;
		for (int i = 1; i < S.length(); i++) {
			if(S.charAt(i-1)!=S.charAt(i))
				condition++;
		}
        System.out.println(condition);
	}
}