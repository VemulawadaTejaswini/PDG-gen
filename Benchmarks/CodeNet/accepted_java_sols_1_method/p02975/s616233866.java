import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc  =new Scanner(System.in);
		int N = sc.nextInt();
		Map<Integer,Integer> map = new HashMap<>();
		for(int i = 0;i < N;i++) {
			int num = sc.nextInt();
			if(map.containsKey(num)) {
				map.put(num, map.get(num)+1);
			}else {
				map.put(num, 1);
			}
		}
		sc.close();
		String s = "";
		if(map.size()==1 && map.containsKey(0)) {
			s = "Yes";
		}else if(map.size()==2
				&& map.containsKey(0)
				&& map.get(0)==N/3) {
			s = "Yes";
		}else if(map.size()==3){
			boolean flag = true;
			Object[] key = map.keySet().toArray();
			int k1 = (int)key[0];
			int k2 = (int)key[1];
			int k3 = (int)key[2];
			if((k1^k2^k3) != 0) {
				flag = false;
			}
			for(Map.Entry<Integer, Integer> e : map.entrySet()) {
				if(e.getValue() != N/3) {
					flag = false;
				}
			}
			s = flag ? "Yes" : "No";
		}else {
			s = "No";
		}
		System.out.println(s);
	}
}