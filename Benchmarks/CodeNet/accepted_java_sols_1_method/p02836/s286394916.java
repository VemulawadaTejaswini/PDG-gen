import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String ss = sc.next();
		int cnt = 0;
		
		for (int i = 0; i < Math.floor(ss.length()/2); i++) {
			if (ss.charAt(i) != ss.charAt(ss.length() - i -1)) {
				cnt++;
			}
		}
		
		
		System.out.println(cnt);
	}
}