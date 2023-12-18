import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			
			HashMap<Integer, Long> salesmen = new HashMap<>();
			ArrayList<Integer> ids = new ArrayList<>();
			
			for(int i = 0; i < n; i++){
				int id = sc.nextInt();
				long each = sc.nextLong();
				long num = sc.nextLong();
				
				if(!ids.contains(id)) ids.add(id);
				salesmen.computeIfPresent(id, (K, O) -> O + each * num);
				salesmen.putIfAbsent(id, each * num);
			}
			
			if(ids.stream()
					.filter(ID -> salesmen.get(ID) >= 1_000_000L)
					.peek(System.out::println)
					.count() == 0) System.out.println("NA");
		}
		sc.close();
		
	}
}