import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		Scanner stdIn = null;
		List<Integer> result = new ArrayList<Integer>();
		Map<String, Integer> rome = new HashMap<String, Integer>();
		rome.put("I", 1); rome.put("V", 5); rome.put("X", 10); rome.put("L", 50); rome.put("C", 100);
		rome.put("D", 500); rome.put("M", 1000);
		
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			while( stdIn.hasNext() ){
				String str = stdIn.next();
				Integer sum = 0;
				for(int i = 0; i < str.length()-1; i++){
					if( rome.get(Character.toString(str.charAt(i))) >= rome.get(Character.toString(str.charAt(i+1))) ){
						sum += rome.get(Character.toString(str.charAt(i)));
					} else {
						sum -= rome.get(Character.toString(str.charAt(i)));
					}
				}
				sum += rome.get(Character.toString(str.charAt(str.length()-1)));
				result.add(sum);
			}
			for(Integer sum : result){
				System.out.println(sum);
			}
		} finally {
			if( stdIn != null ){
				stdIn.close();
			}
		}
	}
}