import java.time.Instant;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		String S = sc.next();

		String ans = S.substring(0, K-1) + S.substring(K-1, K).toLowerCase() + S.substring(K, N);
		System.out.println(ans);

	}
}