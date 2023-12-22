import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		int n = Integer.parseInt(br.readLine());
		Map<String, Object> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String[] commands = br.readLine().split(" ");
			String command = commands[0];
			String target = commands[1];
			
			switch(command){
			case "insert":
				map.put(target, null);
				break;
			case "find":
				if(map.containsKey(target)){
					System.out.println("yes");
				}else{
					System.out.println("no");
				}
				break;
			}
		}
	}
}
