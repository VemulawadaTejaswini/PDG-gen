import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<Integer, Integer> m = new HashMap<>();
		for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            m.putIfAbsent(a, 0);
            m.put(a, m.get(a) + 1);
        }
		int ans = 0;
        for (int a : m.keySet()) {
            if (m.get(a) > a) {
                ans += m.get(a) - a;
            } else if (m.get(a) < a) {
                ans += m.get(a);
            }
        }
        System.out.println(ans);
	}
}