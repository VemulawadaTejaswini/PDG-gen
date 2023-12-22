import java.util.Scanner;

/**
 * https://abc058.contest.atcoder.jp/tasks/abc058_b
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char[] o = sc.next().toCharArray();
		char[] e = sc.next().toCharArray();
		sc.close();
		
		StringBuilder ans = new StringBuilder();
		for(int i=0; i<o.length; i++){
			ans.append(o[i]);
			if(i<e.length) ans.append(e[i]);
		}
 
		System.out.println(ans.toString());
		

	}

}