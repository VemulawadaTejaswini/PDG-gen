import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> list = new ArrayList<>();
        for(int i = 0; i  < n; i++) {
        	String s = normalize(sc.next());
        	list.add(s);
        }

        list.add("zzzzzzzzzzzzzzzzzz");//dummy
        Collections.sort(list);

        long ans = 0;
        for(int i = 0; i < list.size(); i++) {
        	for(int j = i + 1 ; j < list.size(); j++) {
        		if( ! list.get(i).equals(list.get(j))) {
        			ans += (comb(j - i));
        			i = j -1 ;
        			break;
        		}
        	}
        }
        System.out.println(ans);
	}

	public static long comb(long num) {
		return num * (num-1) / 2;
	}

	public static String normalize(String s) {
		int [] num = new int [26];
		for(int i = 0; i < s.length(); i++) {
			int ch = s.charAt(i) - 'a';
			num[ch]++;
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 26; i++) {
			char c = (char)('a' + i);
			for(int j = 0; j < num[i]; j++) {
				sb.append(c);
			}
		}
		return sb.toString();
	}
}