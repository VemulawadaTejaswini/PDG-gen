import java.util.*;
 
 
 
public class Main {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int max = 1;
		 Map<String, Integer> map = new HashMap<String, Integer>();
		 while(N > 0) {
			 String str = sc.next();
			if(map.containsKey(str)) {
				map.put(str,(map.get(str)+1));
			}
			else {
                map.put(str,1);
            }
			 if (map.get(str) > max) {
	                max = map.get(str);
	            }
			N--;
		 }
	        List<String> result = new ArrayList<>();
	        for (String str: map.keySet()){
	            if(map.get(str) == max){
	                result.add(str);
	            }
	        }
	        Collections.sort(result);
	        for(String s : result) {
	        	System.out.println(s);
	        }
	}
}