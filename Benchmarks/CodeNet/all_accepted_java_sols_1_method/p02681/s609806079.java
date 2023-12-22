//package atcoder;
 
import java.util.*;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		
		char S1[] = s1.toCharArray();
		char S2[] = s2.toCharArray();
	
		int count = 0;
		for(int i=0;i<S1.length;i++) {
			if(S1[i] == S2[i]) {
				count ++;
			}
		}
		if(count == S1.length) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}