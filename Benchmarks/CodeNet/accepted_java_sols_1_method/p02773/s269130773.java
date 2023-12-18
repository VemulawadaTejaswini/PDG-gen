import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		String[] inputs = new String[n];
		for(int i = 0; i < n; i++){
			inputs[i] = scanner.nextLine();
		}

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put(inputs[0], 1);
		int max = 1;
		for(int i = 1;i < inputs.length;i++){
			if(map.containsKey(inputs[i])){
				int cnt = map.get(inputs[i]);
				map.put(inputs[i], cnt+1);
				max = Math.max(max, cnt+1);
			}else{
				map.put(inputs[i],1);
			}
		}
		List<String> rs = new ArrayList<String>();
		for(Entry<String, Integer> entry: map.entrySet()){
			if(max == entry.getValue()) rs.add(entry.getKey());
		}
		rs.sort(Comparator.comparing( String::toString ));
		for(String r : rs){
			System.out.println(r);
		}
	}

}
