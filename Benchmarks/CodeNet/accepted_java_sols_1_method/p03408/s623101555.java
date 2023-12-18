import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Map<String,Integer> blue = new HashMap<>();
		Map<String,Integer> red = new HashMap<>();
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			String s=sc.next();
			if(blue.get(s)==null) {
				blue.put(s,1);
			}else {
				blue.put(s,blue.get(s)+1);
			}
		}
		int m=sc.nextInt();
		for(int i=0;i<m;i++) {
			String s=sc.next();
			if(red.get(s)==null) {
				red.put(s,1);
			}else {
				red.put(s,red.get(s)+1);
			}
		}
		int max = 0;
		for(String key : blue.keySet()) {
			int now;
			if(red.containsKey(key)) {
				now =blue.get(key)-red.get(key);
			}else {
				now=blue.get(key);
			}
			if(max<now) {
				max=now;
			}
		}
		System.out.println(max>0?max:0);
	 }
}