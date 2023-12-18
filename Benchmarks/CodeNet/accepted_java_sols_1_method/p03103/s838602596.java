import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long M = sc.nextLong();
	
		Map<Long, Long> shop = new TreeMap<>();
		for(int i = 0; i < N; i++) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			shop.put(a, shop.getOrDefault(a, 0L) + b);
		}
		
		long sum = 0;
		long money = 0;
		
		for(Long price : shop.keySet()) {
			long amount = shop.get(price);
			sum += amount;
			money += price * amount;
			if(sum >= M) {
				money -= price * (sum - M); 
				System.out.println(money);
				break;
			}
		}
	}
}
