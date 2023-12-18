import java.util.*;
public class Main {
	static int n = -1;
	static Scanner sc = new Scanner(System.in);
	static Map<String, String> map = new HashMap<String, String>();
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	static boolean read(){
		n = sc.nextInt();
		if(n == 0)return false;
		for(int i = 0; i < n; i++){
			String key = sc.next();
			String value = sc.next();
			map.put(key, value);
		}
		return true;
	}
	static void solve(){
		String res = "";
		n = sc.nextInt();
		for(int i = 0; i < n; i++){
			String input = sc.next();
			if(map.containsKey(input)){
				res += map.get(input);
			}else{
				res += input;
			}
		}
		System.out.println(res);
	}

}