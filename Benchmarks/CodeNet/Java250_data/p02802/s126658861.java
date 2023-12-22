import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Set<Integer> ACset = new HashSet<>();
		//Set<Integer> WAset = new HashSet<>();
		Map<Integer, Integer> waMap = new HashMap<>();
		int ac = 0;
		int wa = 0;
		int waCount = 0;
		
		for(int i = 0; i < M; i++) {
			int num = sc.nextInt();
			String value = sc.next();
			if(value.equals("AC")) {
				if(!ACset.contains(num)) {
					ac++;
					ACset.add(num);
					if(waMap.containsKey(num)) {
						wa += waMap.get(num);
					}
				}
			}else {
				if(waMap.containsKey(num)) {
					waCount = waMap.get(num);
					waMap.put(num, ++waCount);
				}else {
					waCount = 1;
					waMap.put(num, waCount);
				}
			}
		}

		System.out.println(ac + " " + wa);			
		sc.close();
	}
	
}