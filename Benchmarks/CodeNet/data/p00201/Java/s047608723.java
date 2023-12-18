import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			if(n == 0) break;

			price = new HashMap<String,Integer>();
			while(n-- > 0){
				price.put(sc.next(),sc.nextInt());
			}

			n = sc.nextInt();
			map = new HashMap<String,ArrayList<String>>();
			while(n-- > 0){
				String s = sc.next();
				int m = sc.nextInt();
				map.put(s,new ArrayList<String>());
				while(m-- > 0){
					map.get(s).add(sc.next());
				}
			}

			dp = new HashMap<String,Integer>();
			System.out.println(minCost(sc.next()));
		}
	}

	private static HashMap<String,Integer> price;
	private static HashMap<String,ArrayList<String>> map;
	private static HashMap<String,Integer> dp;

	private static int minCost(String s){
		if(map.get(s) == null) return price.get(s) == null ? -1 : price.get(s);
		if(dp.get(s) != null) return dp.get(s);

		int sum = 0;
		boolean nothingFlg = false;

		for(String tmp : map.get(s)){
			int res = minCost(tmp);
			if(res == -1){
				nothingFlg = true;
				break;
			}
			sum += minCost(tmp);
		}

		dp.put(s, price.get(s) == null ? nothingFlg ? -1 : sum : Math.min(sum,price.get(s)));

		return dp.get(s);
	}
}