import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		//HashMap<String, Integer> map = new HashMap<>();
		int n = scanner.nextInt();
		List<String> key = new ArrayList<>();  
		List<Integer> value = new ArrayList<>();  
		
		for(int i = 0; i < n; i++) {
			String s = scanner.next();
			if(key.contains(s)) {
				value.set(key.indexOf(s), value.get(key.indexOf(s))+1);
			}else {
				key.add(s);
				value.add(1);
			}
		}
		int m = scanner.nextInt();
		for(int i = 0; i < m; i++) {
			String ss = scanner.next();
			if(key.contains(ss)) {
				value.set(key.indexOf(ss), value.get(key.indexOf(ss))-1);
			}else {
				key.add(ss);
				value.add(-1);
			}
		}
		int s = 0;
		for(int a : value) {
			s =Math.max(s, a);
		}
		System.out.println(s);
		
	}

}