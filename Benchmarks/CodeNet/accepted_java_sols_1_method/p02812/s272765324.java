import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int ans = 0;
		while(S.indexOf("ABC") != -1){
			ans++;
			S = S.substring(S.indexOf("ABC") + 3);
		}
		System.out.println(ans);
	}
}