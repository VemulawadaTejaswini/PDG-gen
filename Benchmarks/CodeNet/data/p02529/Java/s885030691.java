import java.util.*;

/* AOJ10030 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		int i=0, n, q, cnt=0;
		n = sc.nextInt();
		while(n>i) {
			map.put(i,sc.nextInt());
			i++;
		}
		q = sc.nextInt();
		i=0;
		while(q>i) {
			if(map.containsValue(sc.nextInt())) cnt++;
			i++;
		}
		System.out.println(cnt);
	}
}