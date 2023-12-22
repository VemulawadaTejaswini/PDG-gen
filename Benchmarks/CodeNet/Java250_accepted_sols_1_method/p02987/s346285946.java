import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		int N = Integer.parseInt(sc.next());
		String S = sc.next();

		Map<String,Integer> map = new HashMap();

		for(int i=0;i < 4;i++) {
			String a = S.substring(i,i+1);
			if(map.containsKey(a)){
				map.put(a, map.get(a)+1);
			} else {
				map.put(a,1);
			}
		}
		for(Integer aa : map.values()) {
			if(aa != 2) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}
