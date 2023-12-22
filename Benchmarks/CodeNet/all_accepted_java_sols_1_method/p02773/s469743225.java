import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	int n = sca.nextInt();
	String[] str = new String[n];
	int temp = 0;
	int max = 0;
	List<String> smallstr = new ArrayList<>();


	Map<String, Integer> map = new HashMap<>();
	for(int i = 0; i < n; i++) {
		str[i] = sca.next();

		if(i == 0) {
			map.put(str[i], 1);
		}

		if(map.containsKey(str[i]) == true && i > 0) {
			temp = map.get(str[i]);
			temp++;
			map.put(str[i], temp);
		}
		else if(map.containsKey(str[i]) != true && i > 0) {
			map.put(str[i], 1);
		}
	}

	for (int val : map.values()) {
		if(val > max) {
			max = val;
		}
	}

	for (String key : map.keySet()) {
		if(map.get(key) == max) {
			smallstr.add(key);
		}
	}

	Collections.sort(smallstr);
	for(String result : smallstr) {
		System.out.println(result);
	}
	// 後始末
	sca.close();
	}
}