import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main (String args[]) throws Exception{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ans = 0;
		Map<String,String> map = new HashMap<String, String>();
		for(int i = 0;i < n; i++) {
			String  s = scan.next();
			if(map.get(s) == null) {
				ans++;
			}
			map.put(s, "");
		}

		System.out.println(ans);
	}
}