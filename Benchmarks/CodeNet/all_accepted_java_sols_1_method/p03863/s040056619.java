import java.util.Scanner;

/**
 * https://abc048.contest.atcoder.jp/tasks/arc064_b
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		sc.close();
		
		String ans = null;
		if(s[0]==s[s.length-1]){
			ans = s.length%2==1 ? "Second" : "First";
		}else{
			ans = s.length%2==0 ? "Second" : "First";
		}
		
		System.out.println(ans);

	}

}