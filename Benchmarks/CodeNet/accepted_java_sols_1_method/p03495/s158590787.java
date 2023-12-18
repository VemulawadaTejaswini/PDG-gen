import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);       
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		int[] a = new int[n];
		Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            a[i] = Integer.parseInt(sc.next());
            if(map.containsKey(a[i])) map.put(a[i], map.get(a[i])+1);
            else map.put(a[i], 1);
        }
        int[] value = new int[map.size()];
        int x=0;
        for(int key : map.keySet()) {
            value[x] = map.get(key);
            x++;
        }
    
        Arrays.sort(value);
        int kijun = map.size()-k;
        int count = 0;
        
        for(int i=0; i<kijun; i++) {
            count += value[i];
            
        }
        
        System.out.println(count);
	}
}