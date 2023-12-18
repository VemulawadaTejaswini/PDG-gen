import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		ALDS1_4_C();
	}
	public static void ALDS1_4_C() {
		Scanner sc = new Scanner(System.in);
		StringBuilder ans = new StringBuilder();
		HashSet<String> list = new HashSet<String>();
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			String order = sc.next();
			String dic = sc.next();
			if(order.equals("insert")) {
				list.add(dic);
			}else if(order.equals("find") ) {
				if(list.contains(dic)) {
					ans.append("yes\n");
				}else {
					ans.append("no\n");
				}
			}
		}
		System.out.print(ans);
	}

}

