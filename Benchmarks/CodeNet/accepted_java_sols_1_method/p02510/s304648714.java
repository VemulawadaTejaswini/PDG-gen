import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> strArray = new ArrayList<>();

		while(true) {
			String str = sc.next();
			
			if(str.equals("-")) {
				break;
			}
			
			int m = sc.nextInt();
			
			for(int i = 0; i < m; i++) {
				int h = sc.nextInt();
				
				str = str.substring(h) + str.substring(0, h);
			}
			
			strArray.add(str);
		}
		
		for(int i = 0; i < strArray.size(); i++) {
			System.out.println(strArray.get(i));
		}
	}
}