import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<String> list = new HashSet<String>();
		try {
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			String[] key = br.readLine().split(" ");
			
			if(key[0].equals("insert")) {
				list.add(key[1]);
				
			} else if (key[0].equals("find")){
				if(list.contains(key[1]) == true) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
				
			}
		}
		}catch(Exception e) {
			System.out.println("error");
		}
	}

}
