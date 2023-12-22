import java.util.Scanner;

/**
 * https://abc072.contest.atcoder.jp/tasks/abc072_b
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		sc.close();
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<s.length; i++){
			if(i%2==0) sb.append(s[i]);
		}
		
		System.out.println(sb.toString());
		
	}

}
