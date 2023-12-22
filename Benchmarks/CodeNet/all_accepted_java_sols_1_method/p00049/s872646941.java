import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		Scanner stdIn = null;
		Map<String, Integer> result = new LinkedHashMap<String, Integer>();
		result.put("A", 0); result.put("B", 0); result.put("AB", 0); result.put("O", 0); 
		
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			while( stdIn.hasNext() ){
				String str = stdIn.next();
				String[] s = str.split(",");
				Integer num = result.get(s[1]);
				result.put(s[1], num+1);
			}
			for(Integer num : result.values()){
				System.out.println(num);
			}
		} finally {
			if( stdIn != null ){
				stdIn.close();
			}
		}
	}
}

				