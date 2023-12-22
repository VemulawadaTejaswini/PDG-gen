import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		String res = "";
		for (char c : S.toCharArray()) {
			int code = c + N;
			if ('Z' < code) {
				code -= 26;
			}
			res += (char) code;
		}
		System.out.println(res);
	}
}