import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Boolean> hash = new HashMap<String, Boolean>();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++){
			String[] str = br.readLine().split(" ");
			
			if(str[0].equals("insert")){
				hash.put(str[1], true);
			} else if(str[0].equals("find")){
				if(hash.get(str[1]) == null){
					System.out.println("no");
				} else {
					System.out.println("yes");
				}
			}
		}
	}
}
