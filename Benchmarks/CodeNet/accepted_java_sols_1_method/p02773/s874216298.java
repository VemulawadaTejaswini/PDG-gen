import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<String,Integer> map = new TreeMap<>();
		int max = 0;
		for(int i = 0;i < N;i++){
			String S = sc.next();

			if(map.containsKey(S)){
				map.put(S, map.get(S)+1);
			}else{
				map.put(S, 1);
			}
			if(max < map.get(S))max = map.get(S);
		}
		sc.close();

		for(Map.Entry<String, Integer> ent : map.entrySet()){
			if(ent.getValue()==max){
				System.out.println(ent.getKey());
			}
		}

	}

}