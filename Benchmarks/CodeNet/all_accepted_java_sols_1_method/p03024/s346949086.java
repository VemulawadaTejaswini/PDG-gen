import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		int cnt=15-s.length();
		for(i=0;i<s.length();i++){
			if(s.charAt(i) == 'o') cnt++;
		}
		System.out.println(cnt>=8?"YES":"NO");
	}
}