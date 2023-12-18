import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {
	private static Map<String, Integer> itemMap = new HashMap<>();
	private static Map<String, List<String>> recipeMap = new HashMap<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		line = br.readLine();
		
		while(true){

			int n = Integer.valueOf(line);

			for(int i = 0; i < n; i++){
				line = br.readLine();
				String[] nums = line.split(" ");
				String s = nums[0];
				int p = Integer.valueOf(nums[1]);
				itemMap.put(s, p);
			}

			line = br.readLine();
			int m = Integer.valueOf(line);
			
			for(int i = 0; i < m; i++){
				line = br.readLine();
				String[] nums = line.split(" ");
				String o = nums[0];
				
				List<String> list = new ArrayList<>();
				
				int k = Integer.valueOf(nums[1]);
				for(int j = 2; j < k + 2; j++){
					String p = nums[j];
					list.add(p);
				}
				recipeMap.put(o, list);
			}

			line = br.readLine();
			String t = line;
			System.out.println(getCost(t));
			

			line = br.readLine();
			if(line.isEmpty()){
				break;
			}
			
		}
		
	}
	
	private static int getCost(String t){
		int min = itemMap.get(t);
		int cost = 0;
		
		List<String> itemList = recipeMap.get(t);
		if(itemList == null){
			return min;
		}
		
		for(String item : itemList){
			cost += getCost(item);
		}
		
		if(min > cost){
			return cost;
		}else{
			return min;
		}
	}

}