import java.util.*;

public class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		List<Map<Integer, Double>> group = new ArrayList<>();
		for(int i = 0; i < 3; i++){
			Map<Integer, Double> g = new TreeMap<>();
			for(int j = 0; j < 8; j++){
				String line = sc.nextLine();
				g.put(Integer.valueOf(line.split(" ")[0]), Double.valueOf(line.split(" ")[1]));
			}
			group.add(g);
		}
		sc.close();
		
		//1st and 2nd
		group.forEach(G -> 
			G.entrySet().stream()
			.sorted(Comparator.comparingDouble(Map.Entry<Integer, Double>::getValue))
			.limit(2)
			.forEach(E -> System.out.printf("%d %.2f\n", E.getKey(), E.getValue()))
		);
		
		//consolation
		Map<Integer, Double> consolation = new TreeMap<>();
		group.forEach(G -> G.entrySet()
			.stream()
			.sorted(Comparator.comparingDouble(Map.Entry<Integer, Double>::getValue))
			.skip(2)
			.forEach(E -> consolation.put(E.getKey(), E.getValue())));
		consolation.entrySet()
			.stream()
			.sorted(Comparator.comparingDouble(Map.Entry<Integer, Double>::getValue))
			.limit(2)
			.forEach(C -> System.out.printf("%d %.2f\n", C.getKey(), C.getValue())
		);
	}
	
}