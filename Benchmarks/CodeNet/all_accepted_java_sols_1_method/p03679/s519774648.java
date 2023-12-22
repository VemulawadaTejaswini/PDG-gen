import java.util.Scanner;

/**
 * https://abc065.contest.atcoder.jp/tasks/abc065_a
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long A = sc.nextLong();
		long B = sc.nextLong();
		sc.close();
		
		String ans = "delicious";
		if(A-B<0){
			ans = B-A <=X ? "safe" : "dangerous";
		}
		System.out.println(ans);

	}

}