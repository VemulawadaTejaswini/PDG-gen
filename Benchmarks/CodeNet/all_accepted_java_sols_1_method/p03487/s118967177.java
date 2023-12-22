import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<n;i++){
			int a = scanner.nextInt();
			if(map.containsKey(a)){
				map.put(a, map.get(a) + 1);
			}else{
				map.put(a, 1);
			}
		}
		int count = 0;
		for(Integer key : map.keySet()){
			if(map.get(key) < key){
				count += map.get(key);
			}else if(map.get(key) > key){
				count += map.get(key) - key;
			}
		}
		System.out.println(count);
	}

}
