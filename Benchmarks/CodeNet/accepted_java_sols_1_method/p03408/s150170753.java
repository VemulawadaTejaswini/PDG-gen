import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=Integer.parseInt(sc.nextLine());
		Map<String,Integer> keywords=new HashMap<>();
		for(int i=0;i<N;i++) {
			String key=sc.nextLine();
			if(keywords.containsKey(key)) {
				keywords.put(key,keywords.get(key)+1);
			}else {
				keywords.put(key, 1);
			}
		}
		N=Integer.parseInt(sc.nextLine());
		for(int i=0;i<N;i++) {
			String key=sc.nextLine();
			if(keywords.containsKey(key)) {
				keywords.put(key,keywords.get(key)-1);
			}
		}
		Integer max=keywords.values().stream().max(Integer::compare).get();
		System.out.println(max<0?0:max);
	}
}