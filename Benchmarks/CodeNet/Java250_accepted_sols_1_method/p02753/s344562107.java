import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String s=sc.next();
		boolean a=false,b=false;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='A') {
				a=true;
			}else if(s.charAt(i)=='B') {
				b=true;
			}
		}
		System.out.println(a&&b? "Yes":"No");
	}
}
