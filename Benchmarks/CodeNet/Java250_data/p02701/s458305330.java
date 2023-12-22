import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] arg) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<String> list = new ArrayList<String>();
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i < n; i++){
			String s = scan.next();
			if(map.containsKey(s)){
				int v = map.get(s);
				map.put(s, v+1);
			} else {
				map.put(s, 1);
			}

		}
		System.out.println(map.keySet().size());
	}
}
