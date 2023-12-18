import java.util.Scanner;

/**
 * https://abc066.contest.atcoder.jp/tasks/abc066_b
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		
		int ans = 0;
		for(int i=1; i<s.length(); i++){
			int l = s.length()-i;
			if(l%2==1) continue;
			String s1 = s.substring(0,l/2);
			String s2 = s.substring(l/2,l);
			if(s1.equals(s2)){
				ans = l;
				break;
			}
		}
		
		System.out.println(ans);

	}

}