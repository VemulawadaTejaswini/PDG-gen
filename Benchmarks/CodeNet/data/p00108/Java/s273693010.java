import java.util.*;

public class Main{
	public static boolean check(Map<Integer, Integer> map){
		boolean flag = true;
		for(Integer x : map.keySet()){
			if( x != map.get(x) ){
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);		
		List<String> result = new ArrayList<String>();
		int n;
		while( (n = stdIn.nextInt()) != 0 ){
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			int[] x = new int[n];
			int count = 0;
			for(int i = 0; i < x.length; i++){
				x[i] = stdIn.nextInt();
				map.put(x[i], (map.get(x[i]) == null) ? 1 : map.get(x[i])+1);
			}
			while( !check(map) ){
				for(int i = 0; i < x.length; i++){
					x[i] = map.get(x[i]);
				}
				map.clear();
				for(int i = 0; i < x.length; i++){
					map.put(x[i], (map.get(x[i]) == null) ? 1 : map.get(x[i])+1);
				}
				count++;
			}
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < x.length; i++){
				sb.append(x[i] + " ");
			}
			sb.deleteCharAt(sb.length()-1);		
			result.add(Integer.toString(count));
			result.add(sb.toString());
			
		}
		for(String str : result){
			System.out.println(str);			
		}
	}
}