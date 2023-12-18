import java.util.*;
import java.io.*;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, ArrayList<Integer>> map = new TreeMap<String, ArrayList<Integer>>();
		ArrayList<Integer> page ;

		while (sc.hasNext() ) {
			String key = sc.next();
			int pageIn = sc.nextInt();
			if ( !map.containsKey(key) ) {
				map.put(key, new ArrayList<Integer>() );
			}
			map.get(key).add(pageIn);
		}
		
		
		Iterator it = map.keySet().iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			ArrayList <Integer> list = map.get(key);
			Collections.sort(list);
			System.out.println(key);
			for(int i = 0; i < list.size(); i++){
				if(i == 0){
					System.out.print(list.get(i));
				}else{
					System.out.print(" " + list.get(i));
				}
			}
			System.out.println();
			
                 }
		
	}

}  