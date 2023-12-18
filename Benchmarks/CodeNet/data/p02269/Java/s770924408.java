import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dictionary dict = new Dictionary();
		int N = sc.nextInt();
		for(int i = 0; i < N; i++) {
			String cmd = sc.next();
			if(cmd.equals("insert")) {
				String value = sc.next();
				dict.insert(value);
			}else if(cmd.equals("find")) {
				String value = sc.next();
				dict.find(value);
			}
		}
		sc.close();
	}
}

class Dictionary{
	private Map<Integer, String> hm = new HashMap<Integer,String>();

	int getChar(char ch) {
		if(ch == 'A') {
			return 1;
		}else if(ch == 'C') {
			return 2;
		}else if(ch == 'G') {
			return 3;
		}else {
			return 4;
		}
	}

	int getKey(String str) {  // ハッシュ関数
		int sum = 0, p = 1;
		for(int i = 0; i < str.length(); i++) {
			sum += p * getChar(str.charAt(i));
			p *= 5;
		}
		return sum;
	}

	void find(String str) {
		int key = getKey(str);
		if(hm.get(key) != null) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}

	void insert(String str) {
		int key = getKey(str);
		hm.put(key, str);
	}
}
