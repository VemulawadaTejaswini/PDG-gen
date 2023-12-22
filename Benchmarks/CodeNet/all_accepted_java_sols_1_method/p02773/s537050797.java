//package atcoder;
 
import java.util.*;
import java.math.BigDecimal;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S[] = new String[N];
		for(int i=0;i<N;i++) {
			S[i] = sc.next();
			//System.out.println(S[i]);
		}
		Map<String,Integer> map = new TreeMap<String,Integer>();
		for(int j=0;j<N;j++) {
			if(map.containsKey(S[j])) {
				map.put(S[j],map.get(S[j])+1);
			}else {
				map.put(S[j],1);
			}
		}
		Object[] mapkey = map.keySet().toArray();
        Arrays.sort(mapkey);
        
//        for (String key : map.keySet()) {
//			System.out.println(key);
//		}
        int max = 0;
        for(int k=0;k<N;k++) {
        	max = Math.max(max,map.get(S[k]));
        }
      //  System.out.println(max);
        
//        for(Integer val : map.values()){
//		    System.out.println(val);
//		}
        
        for (String key : map.keySet()) {
        	if(map.get(key)==max) {
			System.out.println(key);
		}
        }
    	  
	}
}