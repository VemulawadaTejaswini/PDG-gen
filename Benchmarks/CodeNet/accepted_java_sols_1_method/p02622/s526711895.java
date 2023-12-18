import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		String t=sc.next();
		
		char[] ss=s.toCharArray();
		char[] tt=t.toCharArray();
		
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(ss[i]!=tt[i]) {
				count++;
			}
		}
		
		System.out.println(count);
 		
		sc.close();
	}
}
