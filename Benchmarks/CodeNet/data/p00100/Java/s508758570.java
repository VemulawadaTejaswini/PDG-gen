import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			int n = sc.nextInt();
			if(n == 0) break;
			
			Map<Integer, Long> salesmen = new HashMap<>();
			for(int i = 0; i < n; i++){
				int id = sc.nextInt();
				int each = sc.nextInt();
				int num = sc.nextInt();
				
				salesmen.computeIfPresent(id, (K, O) -> (long)(O + each * num));
				salesmen.putIfAbsent(id, (long) (each * num));
			}
			
			boolean na = salesmen.keySet()
				.stream()
				.filter(ID -> salesmen.get(ID) >= 1000000L)
				.peek(System.out::println)
				.count() == 0;
			
			if(na) System.out.println("NA");
		}
		sc.close();
	}
	
}