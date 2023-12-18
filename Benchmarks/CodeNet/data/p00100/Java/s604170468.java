import java.util.HashMap;
import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			int n = sc.nextInt();
			if(n == 0) break;
			
			HashMap<Integer, Long> salesmen = new HashMap<>();
			for(int i = 0; i < n; i++){
				int id = sc.nextInt();
				long each = sc.nextInt();
				long num = sc.nextInt();
				
				salesmen.computeIfPresent(id, (K, O) -> O + each * num);
				salesmen.putIfAbsent(id, each * num);
			}
			
			if(salesmen.keySet()
				.stream()
				.filter(ID -> salesmen.get(ID) >= 1_000_000L)
				.peek(System.out::println)
				.count() == 0) System.out.println("NA");
		}
		sc.close();
		
	}
}