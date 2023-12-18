import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> cards = new ArrayList<Integer>();
		for(int i = 0;i < n ;i++) {
			cards.add(sc.nextInt());
		}
		Collections.sort(cards);
		Collections.reverse(cards);
		int ans = 0;
		for(int i = 0;i < n;i++) {
			if(i % 2 == 0) ans += cards.get(i);
			else ans -= cards.get(i);
		}
		System.out.println(ans);
        sc.close();
	}
}