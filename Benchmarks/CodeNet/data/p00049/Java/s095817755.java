import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		new Main().solve();
	}
	
	void solve(){
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("A", 0);
		map.put("B", 0);
		map.put("AB", 0);
		map.put("O", 0);
		
		while(sc.hasNext()){
			String str[] = sc.next().split("\\,");
			String p = str[1];
			map.put(p, map.get(p)+1);
		}
		
		System.out.println(map.get("A"));
		System.out.println(map.get("B"));
		System.out.println(map.get("AB"));
		System.out.println(map.get("O"));
		
		sc.close();
	}
	
	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}
}