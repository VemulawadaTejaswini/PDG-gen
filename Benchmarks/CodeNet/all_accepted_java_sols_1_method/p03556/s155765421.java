import java.util.Scanner;

/**
 * https://beta.atcoder.jp/contests/abc077/tasks/abc077_b
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int ans = 1;
		while((ans+1)*(ans+1)<=N){
			ans++;
		}
		System.out.println(ans*ans);

	}

}
