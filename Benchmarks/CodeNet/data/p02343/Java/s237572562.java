import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int n = Integer.valueOf(line.split(" ")[0]);
		int q = Integer.valueOf(line.split(" ")[1]);
		
		Map<Integer, Integer> group = new TreeMap<>();
		for(int i = 0; i < n; i++){
			group.put(i, i);
		}
		for(int i = 0; i < q; i++){
			String query = sc.nextLine();
			int command = Integer.valueOf(query.split(" ")[0]);
			int x = Integer.valueOf(query.split(" ")[1]);
			int y = Integer.valueOf(query.split(" ")[2]);
			
			switch(command){
				case 0:
					unite(group, x, y);
					break;
				case 1:
					System.out.println(same(group, x, y)? "1": "0");
					break;
			}
		}
		sc.close();
	}
	
	//copy element of group2 to group1, and remove group2
	static void unite(Map<Integer, Integer> group, int x, int y){
		int group1 = group.get(x);
		int group2 = group.get(y);
		for(Map.Entry<Integer, Integer> e: group.entrySet()){
			if(e.getValue() == group2) e.setValue(group1);
		}
	}
	
	static boolean same(Map<Integer, Integer> group, int x, int y){
		return group.get(x).equals(group.get(y));
	}
}