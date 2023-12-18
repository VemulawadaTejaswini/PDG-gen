import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("A", 0);
		map.put("B", 0);
		map.put("O", 0);
		map.put("AB", 0);
		
		while(true){
			String str = br.readLine();
			
			if(str == null){
				break;
			}
			
			String[] tmpArray = str.split(",");
			String type = tmpArray[1];
			map.put(type, map.get(type)+1);
			
		}
		
		System.out.println(map.get("A"));
		System.out.println(map.get("B"));
		System.out.println(map.get("AB"));
		System.out.println(map.get("O"));

	}

}