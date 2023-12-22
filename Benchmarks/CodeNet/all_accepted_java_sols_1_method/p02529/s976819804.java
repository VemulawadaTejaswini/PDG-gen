import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<Integer, Integer> map = new HashMap<>(n);
		for(int i = 0;i<n;i++){
			map.put(sc.nextInt(),2);
		}
		
		int q = sc.nextInt();
		HashMap<Integer, Integer> map2 = new HashMap<>(q);
		for(int i = 0;i<q;i++){
			map2.put(sc.nextInt(),2);
		}
		
		int t = 0;
		if(n>q){
			for (Entry<Integer, Integer> m : map2.entrySet()) {
				if(map.get(m.getKey())!=null){
					t++;
					
				}
			}
		}else{
			for (Entry<Integer, Integer> m : map.entrySet()) {
				if(map2.get(m.getKey())!=null){
					t++;
				}
			}
		}
		System.out.println(t);
		
	}
}