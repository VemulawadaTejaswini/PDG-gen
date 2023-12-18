import java.util.*;

public class Main{
	
	public static void main(String... args){
		Map<String, List<Integer>> map = new TreeMap<>();
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			String line = sc.nextLine();
			if(line.equals("end")) break;
			String word = line.split(" ")[0];
			int page = Integer.parseInt(line.split(" ")[1]);
			List<Integer> pageList = map.getOrDefault(word, new ArrayList<>());
			pageList.add(page);
			map.put(word, pageList);
		}
		sc.close();
		
		for(Map.Entry<String, List<Integer>> entry: map.entrySet()){
			System.out.println(entry.getKey());
			entry.getValue().sort(Comparator.comparing(Integer::intValue));
			for(int i = 0; i < entry.getValue().size()-1; i++){
				System.out.print(entry.getValue().get(i) + " ");
			}
			System.out.println(entry.getValue().get(entry.getValue().size()-1));
		}
	}
}