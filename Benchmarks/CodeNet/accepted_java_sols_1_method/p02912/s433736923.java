import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
        PriorityQueue<Integer> prices = new PriorityQueue(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
          prices.add(Integer.parseInt(sc.next()));
        }
        for (int i = 0 ; i < m; i++) {
          int maxValue = (int)prices.poll();
          prices.add(maxValue / 2);
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
          ans += (int)prices.poll();
        }
        
		// 出力
		System.out.println(ans);
	}
}