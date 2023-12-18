//package atcoder;
 
import java.util.*;
//import java.math.BigDecimal;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int ac = 0;
		int wa[] = new int [N];
		int wawa = 0;
		TreeMap<Integer,String> map = new TreeMap<Integer,String>();
		for(int i=0;i<M;i++) {
			int p = sc.nextInt();
			String s = sc.next();
			if(map.containsKey(p)) {
				if(map.get(p).equals("AC")) {
					continue;
				}else {
					map.put(p,s);
					if(s.contentEquals("AC")) {
						ac ++;
						continue;
					}else if(s.contentEquals("WA")) {
						wa[p-1] ++;
						continue;
					}
			}
		}
			map.put(p,s);
			if(s.equals("AC")) {
				ac ++;
			}else if(s.equals("WA")){
				wa[p-1]++;
			}
		}
		for(Integer key:map.keySet()) {
			if(map.get(key).equals("AC")) {
				wawa += wa[key-1];
			}
		}
		System.out.print(ac+" "+wawa);
}
}