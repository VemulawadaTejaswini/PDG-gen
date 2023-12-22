import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];

		for(int i = 0 ; i < n ; ++i){
			a[i] = sc.nextInt();
		}

		Map<Integer , Integer> m = new HashMap<Integer , Integer>();

		for(int i = 0 ; i < n ; ++i){
			m.put(a[i], m.containsKey(a[i]) ? m.get(a[i]) +1 : 1);
		}
		
		int sum = 0;
		for(int k : m.keySet()){
			int v = m.get(k);
			
			if(k < v){
				sum += v-k;
			}else if(k > v){
				sum += v;
			}
		}
		
		System.out.println(sum);
	}
}