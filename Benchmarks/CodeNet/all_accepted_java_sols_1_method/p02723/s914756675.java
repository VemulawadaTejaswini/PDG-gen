//package atcoder;
 
import java.util.*;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		//System.out.println(s.charAt(3));
//		char S[] = new char[6];
//		for(int i=0;i<6;i++) {
//			S[i] = s.toCharArray();
//		}
		
		if(s.charAt(2)==s.charAt(3)&&s.charAt(4)==s.charAt(5)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}