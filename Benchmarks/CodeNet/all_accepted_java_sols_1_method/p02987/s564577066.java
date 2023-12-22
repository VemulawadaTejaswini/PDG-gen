import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();

		HashMap<Character,String> map = new HashMap<Character,String>();
		for(int i=0;i<W.length();i++){
			if(map.containsKey(W.charAt(i))){

			}else{
				map.put(W.charAt(i), "");
			}
		}
		if(map.keySet().size() == 2){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}


}
