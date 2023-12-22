import java.util.*;
public class Main {

	public static void main(String[] args) {
		int a=0,b=0,ans=0;
		Scanner sc = new Scanner(System.in);
		String c = sc.next();
		a = c.indexOf('A');
		for(int i = a+1;i < c.length();i++) {
			if(c.charAt(i) == 'Z')b = i;
		}
		ans = b - a + 1;
		System.out.println(ans);
	}

}
