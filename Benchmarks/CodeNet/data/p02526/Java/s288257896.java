import java.util.*;

/* No.10031 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] s = new int[100000], table = new int[200000];
		int n = sc.nextInt();
		for ( int i = 0; i < n; i++ )
			s[i] = sc.nextInt();
		int m = sc.nextInt();
		for ( int i = 0; i < m; i++ )
			table[sc.nextInt()] = 1;
		int count = 0;
		for ( int i = 0; i < n; i++ )
			count += table[s[i]];
		System.out.println(count);
	}
}