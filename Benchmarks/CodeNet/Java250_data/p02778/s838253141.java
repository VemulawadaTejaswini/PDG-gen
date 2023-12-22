import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < S.length(); i++) {
			sb.append("x");
		}
		System.out.println(sb.toString());
	}
}