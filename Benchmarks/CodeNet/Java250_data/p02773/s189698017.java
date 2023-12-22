import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<String, Integer> map = new TreeMap<>();
		int max = 0;
		for(int i=0;i<n;i++){
			String s = sc.next();
			int c = 0;
			if(map.containsKey(s)){
				c = map.get(s);
			}
			map.put(s, ++c);
			if(max<c){
				max = c;
			}
		}
		sc.close();
		for(Entry<String, Integer> s : map.entrySet()){
			if(s.getValue()==max)System.out.println(s.getKey());
		}
	}
}