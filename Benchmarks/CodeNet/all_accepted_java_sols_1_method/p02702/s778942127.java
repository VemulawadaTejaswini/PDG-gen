import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int N = S.length();
		int mod[] = new int[N];
		int cur = 0;
		int base = 1;
		for(int i = S.length() - 1 ; i >= 0 ; --i){
			cur = cur + (S.charAt(i) - '0') * base;
			cur = cur % 2019;
			mod[i] = cur;
			base = (base * 10) % 2019;
 		}
		Map<Integer, Integer> m  = new HashMap<Integer, Integer>();
		m.put(0, 1);
		long ret = 0;
		for(int i = mod.length - 1 ; i >= 0 ; --i){
			int v = mod[i];
			if(m.containsKey(v)){
				int g = m.get(v);
				ret += g;
//				System.out.println(g);
				m.put(v, g + 1);
			}else{
				m.put(v, 1);
			}
		}
//		System.out.println(Arrays.toString(mod));
		System.out.println(ret);
	}
}
