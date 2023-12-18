import java.util.*;

/* AOJ10031 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<Integer>();
		int i=0, n, q, cnt=0;
		n = sc.nextInt();
		while(n>i) {
			set.add(sc.nextInt());
			i++;
		}
		q = sc.nextInt();
		i=0;
		while(q>i) {
			if(set.contains(sc.nextInt())) cnt++;
			i++;
		}
		System.out.println(cnt);
	}
}