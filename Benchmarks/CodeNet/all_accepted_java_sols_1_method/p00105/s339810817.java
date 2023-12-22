import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		Map<String,Set<Integer>> words = new TreeMap<String, Set<Integer>>();
		
		while(sc.hasNextLine()){
			String[] strs = sc.nextLine().split(" ");
			
			if(words.containsKey(strs[0])){
				words.get(strs[0]).add(Integer.parseInt(strs[1]));
			}else{
				Set<Integer> tmp = new TreeSet<Integer>();
				tmp.add(Integer.parseInt(strs[1]));
				words.put(strs[0], tmp);
			}
		}
		
		for(String str:words.keySet()){
			System.out.println(str);
			boolean first = false;
			
			for(Integer i:words.get(str)){
				if(first){
					System.out.print(" ");
				}else{
					first = true;
				}
				
				System.out.print(i);
			}
			System.out.println();
		}
		
	}
}