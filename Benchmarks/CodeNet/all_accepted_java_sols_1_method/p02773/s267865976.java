import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		Map<String, Integer> ansMap = new TreeMap<>();
		for(int i = 0 ; i < n; i++) {
			String nextStr = sc.nextLine();
			ansMap.compute(nextStr, (k,v) -> (v == null)? new Integer(1):new Integer(v+1));
		}
		sc.close();
		List<Map.Entry<String,Integer>> esList = ansMap.entrySet().stream()
	        .sorted(java.util.Collections.reverseOrder(java.util.Map.Entry.comparingByValue())).collect(Collectors.toList());
		
		int val = esList.get(0).getValue();
		for(Map.Entry<String, Integer> entry : esList) {
			if(val == entry.getValue()) {
				System.out.println(entry.getKey());
			}else {
				break;
			}
		}
	}
}