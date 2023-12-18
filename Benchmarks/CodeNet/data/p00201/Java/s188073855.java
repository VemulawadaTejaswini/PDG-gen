import java.awt.geom.Point2D;
import java.lang.Character.Subset;
import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ0201();
	}
	
	class AOJ0201{
		
		int dfs(String target){
//			System.out.println(target);
			int b = price.get(target);
			int a = 0;
			if(!map.containsKey(target))return b;
			for(int i=0;i<map.get(target).size();i++){
				a += dfs(map.get(target).get(i));
			}
			return Math.min(a, b);
		}
		HashMap<String, ArrayList<String>> map;
		HashMap<String, Integer> price;
		
		public AOJ0201() {
			
			while(true){
				int n = in.nextInt();
				if(n==0)break;
				price = new HashMap<String, Integer>();
				for(int i=0;i<n;i++)price.put(in.next(),in.nextInt());
				int list_n = in.nextInt();
				map = new HashMap<String, ArrayList<String>>();
				for(int i=0;i<list_n;i++){
					String name = in.next();
					ArrayList<String> list = new ArrayList<String>();
					int a = in.nextInt();
					for(int s=0;s<a;s++)list.add(in.next());
					map.put(name, list);
				}
				String target = in.next();
				System.out.println(dfs(target));
			}
		}
	}
}