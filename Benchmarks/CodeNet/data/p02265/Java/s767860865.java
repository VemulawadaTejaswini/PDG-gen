import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException, NumberFormatException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> list = new LinkedList<String>();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++){
			String[] str = br.readLine().split(" ");
			
			switch (str[0]){
			case "insert":
				list.add(0, str[1]);
				break;
				
			case "delete":
				if(list.indexOf(str[1]) >= 0){
					list.remove(list.indexOf(str[1]));
				}
				break;
				
			case "deleteFirst":
				list.remove(0);
				break;
				
			case "deleteLast":
				list.remove(list.size() - 1);
				break;
			}
		}
		
		for(int i = 0; i < list.size(); i++){
			System.out.print(list.get(i));
			
			if(i + 1 == list.size()){
				System.out.print("\n");
			} else {
				System.out.print(" ");
			}
		}
	}

}