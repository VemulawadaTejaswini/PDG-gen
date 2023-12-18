import java.util.Scanner;

/**
 * https://abc047.contest.atcoder.jp/tasks/arc063_a
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		sc.close();
		
		int ans = 0;
		for(int i=1; i<s.length; i++){
			if(s[i]!=s[i-1])
				ans++;
		}
		
		System.out.println(ans);	

	}

}